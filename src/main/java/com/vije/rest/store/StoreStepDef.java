package com.vije.rest.store;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import static com.jayway.restassured.path.json.JsonPath.from;
import java.lang.String;

import java.util.List;

import static io.restassured.RestAssured.given;

public class StoreStepDef {
	
	
	@Given("^I hit the store rest end point and it is alive$")
	public void i_hit_the_store_rest_end_point_and_it_is_alive() throws Throwable {
		int statusCode;
		statusCode = given().get("http://localhost:8080/testingExample/rest/store").getStatusCode();
	   if ( statusCode == 200 ) {
		   System.out.println("Store end point is Alive");
	   }
	   else {
		   System.out.println("Store end point is Down");
		}
	    
	}

	@When("^I Check for the titles of book prices less than ten$")
	public void i_Check_for_the_titles_of_book_prices_less_than_ten() throws Throwable {
		
		String response = given().get("http://localhost:8080/testingExample/rest/store").asString();
		List<String> bookTitles = from(response).getList("store.book.findAll { it.price < 10 }.title");
		for (String book :  bookTitles) {
			if ( book.equalsIgnoreCase("Sayings of the century") || book.equalsIgnoreCase("Moby Dick")) {
				System.out.println("Test Success - Book titles less than 10$ " + book.toString());
			}
		}
	}

	@Then("^It must contain two titles$")
	public void it_must_contain_two_titles() throws Throwable {
		
		String response = given().get("http://localhost:8080/testingExample/rest/store").asString();
		List<String> bookTitles = from(response).getList("store.book.findAll { it.price < 10 }.title");
		for (String book :  bookTitles) {
			if ( book.equalsIgnoreCase("Sayings of the century") || book.equalsIgnoreCase("Moby Dick")) {
				System.out.println("Test Success - Book titles  " + book.toString());
			}
		}
		
	    
	}


}
