package com.vije.test.lotto;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class RestLotto {
	
	@Test
	public void LottoId(){
		
		given().get("/lotto").then().body("lotto.lottoId", equalTo(5));
	}
	//get("/lotto").then().body("lotto.winners.winnerId", hasItems(23, 54));

}
