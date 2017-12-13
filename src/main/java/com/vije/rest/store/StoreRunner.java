package com.vije.rest.store;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json/target/"},
		features = {"/src/main/java/com/vije/rest/store/"},
		glue = {"/src/main/java/com/vije/rest/store/"}
		)


public class StoreRunner {

}
