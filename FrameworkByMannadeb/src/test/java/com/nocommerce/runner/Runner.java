package com.nocommerce.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features= {"Features/RegistrationAndLogin.feature"},
		glue= {"com.nocommerce.stepdef","com.nocommerce.hooks"},
		plugin= {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
		)

public class Runner extends AbstractTestNGCucumberTests{
	
	

}
