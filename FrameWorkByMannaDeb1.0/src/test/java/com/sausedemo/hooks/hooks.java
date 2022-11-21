package com.sausedemo.hooks;

import java.io.IOException;

import com.sauseDemoBasePage.BaseClass1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends BaseClass1 {
    
	@Before
	public static void initialize() throws IOException {
		 BaseClass1.initializeproperties();
		 BaseClass1.Setup();
	}
	
	@After
	public static void tearDown() {
		driver.quit();
		
	}
	
	

}
