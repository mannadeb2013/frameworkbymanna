package com.sausedemo.runner;



import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.sauseDemoBasePage.BaseClass1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

             features= {"Feature/LoginCheckoutAndLogout.feature","Feature/NegetiveTestingLogin.feature"},
             glue = {"com.sausedemo.stefdef","com.sausedemo.hooks"},
    		 plugin= {"pretty","json:target/cucumber.json"},
             dryRun = false,
             monochrome = true
		
		)

public class Runner extends  AbstractTestNGCucumberTests{
	
	@BeforeClass
	@Parameters("browsertype")
	public static void beforeclass(@Optional("chrome")String browser) throws IOException {
		new BaseClass1();
		BaseClass1.initializeproperties();
		BaseClass1.property.setProperty("browserType", browser);
	}
	
	@AfterClass
	public static void afterclass() {}
}
   