package com.vije.rest.lotto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.List;

import static io.restassured.RestAssured.given;

public class LottoStepDef {
	
	@Given("^I hit the lotto rest end point and it is alive$")
	public void i_hit_the_lotto_rest_end_point_and_it_is_alive() throws Throwable {
		
		int statusCode;
		statusCode = given().get("http://localhost:8080/testingExample/rest/lotto").getStatusCode();
	   if ( statusCode == 200 ) {
		   System.out.println("Lotto end point is Alive");
	   }
	   else {
		   System.out.println("Lotto end point is Down");
		}
	   
	}

	@Then("^The lotto lottoid is five$")
	public void the_lotto_lottoid_is_five() throws Throwable {
		
		//given().get("http://localhost:8080/testingExample/rest/lotto").then().body("lotto.lottoId", equalTo(5));
		//System.out.println("LottoID has number 5");
		String lottoJson = given().get("http://localhost:8080/testingExample/rest/lotto").asString();
		JsonPath jsonPath = new JsonPath(lottoJson).setRoot("lotto");
		int lottoId = jsonPath.getInt("lottoId");
			if (lottoId == 5) {
				System.out.println("lotto.lottoId is 5 , test case passed");
			}
			else {
				System.out.println("lotto.lottoId is not 5 , test case failed");
			}	
		}

	@Then("^The lotto winners id contains given numbers$")
	public void the_lotto_winners_id_contains_given_numbers() throws Throwable {
		String winnerJson = given().get("http://localhost:8080/testingExample/rest/lotto").asString();
		JsonPath jsonPath = new JsonPath(winnerJson).setRoot("lotto");
		List winnerIds = jsonPath.get("winners.winnerId");
		System.out.println(winnerIds.toString());
	}

	
}
