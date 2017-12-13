package com.vije.first;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefapi {
	
	
	
	@Given("^The user enter \"([^\"]*)\"$")
	public void the_user_enter(String arg1) throws Throwable {
		given().get("http://cmapi.bananaappscenter.com/api/Location/locationdetails");
	}

	@Then("^It should display status/success code \"([^\"]*)\"$")
	public void it_should_display_status_success_code(String arg1) throws Throwable {
		given().get("http://cmapi.bananaappscenter.com/api/Location/locationdetails").then().statusCode(200).log().all();
	}

}
