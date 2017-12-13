package com.vije.first;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json/target/"},
		features = {"/src/main/java/com.vije.first"},
		glue = {"/src/main/java"}
		)


public class apiRunner {

}
