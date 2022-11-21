package com.sausedemo.stefdef;

import org.openqa.selenium.By;

import com.sauseDemoBasePage.BaseClass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegetiveLoginStefdef extends BaseClass1{
	
	@Given("I open the browser and I navigate to the application")
	public void i_open_the_browser_and_i_navigate_to_the_application() {
		 BaseClass1.Setup();
		 driver.get("https://www.saucedemo.com/");
	   
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String Username, String Password) {
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys(Username);
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys(Password);
	   
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	   
	}

	@Then("I am suppose to get an error message")
	public void i_am_suppose_to_get_an_error_message() {
	   
	   
	}

}
