package com.nocommerce.hooks;

import com.NopCommerce.Basepage.BaseProjectClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseProjectClass {
	
	//initialize start the browser 
	@Before
	public static void Initialize() {
		BaseProjectClass.Browserlaunch();
		
	}
	
	//teardown close the browser
	@After
	public static void TearDown() {
		driver.quit();
	}

}
