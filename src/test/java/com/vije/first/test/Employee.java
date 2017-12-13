package com.vije.first.test;
 
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Employee {
	
	@Test
	public void validateEmployee() {
		given().get("http://cmapi.bananaappscenter.com/api/Location/locationdetails").then().statusCode(200).log().all();
	}

}
