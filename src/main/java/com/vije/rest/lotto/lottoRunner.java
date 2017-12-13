package com.vije.rest.lotto;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json/target/"},
		features = {"/src/main/java/com/vije/rest/lotto/"},
		glue = {"/src/main/java/com/vije/rest/lotto/"}
		)


public class lottoRunner {

}
