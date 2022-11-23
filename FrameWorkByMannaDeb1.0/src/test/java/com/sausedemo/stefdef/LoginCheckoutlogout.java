package com.sausedemo.stefdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.sauseDemo.elements.ElementPage;
import com.sauseDemo.utils1.Utilities1;
import com.sauseDemoBasePage.BaseClass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCheckoutlogout extends  BaseClass1{
	
	ElementPage pf = PageFactory.initElements(driver,ElementPage.class );
	
	
	@Given("One User Open The Browser")
	public void one_user_open_the_browser() {
		BaseClass1.Setup();
	    
	}

	@Given("Two User Navigate to  {string}")
	public void two_user_navigate_to(String string) {
	 driver.get("https://www.saucedemo.com/");
	    
	}

	@Given("User put Valid User Name")
	public void user_put_valid_user_name() {
		
	    pf = PageFactory.initElements(driver, ElementPage.class);
	    pf.getUsername().sendKeys("standard_user");
	    Utilities1.getHighLighter(pf.getUsername());
		//driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("standard_user");
		//Utilities1.getHighLighter(driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")))	;
	}

	@Given("User put Valid  User Password")
	public void user_put_valid_user_password() {
		pf = PageFactory.initElements(driver, ElementPage.class);
		pf.getPassword().sendKeys("secret_sauce");
		Utilities1.getHighLighter(pf.getPassword());
	}

	@Given("User Click on Submit Button")
	public void user_click_on_submit_button() {
	   
		pf.getSubmitButton().click();
	}

	@Then("User  Successfully Logged in In page")
	public void user_successfully_logged_in_in_page() {
	   
	    
	}

	@When("User Click on The Sauce Labs Backpack")
	public void user_click_on_the_sauce_labs_backpack() {
		pf.getBackpack().click();
	    
	}

	@When("User Click on Shopping Cart")
	public void user_click_on_shopping_cart() {
		pf.getShoppingCart().click();

	}

	@When("User Clicks On CheckOut Button")
	public void user_clicks_on_check_out_button() {
		pf.getCheckOutButton().click();
	    
	}

	@When("User Put Valid FirstName")
	public void user_put_valid_first_name() {
		pf.getFirstName().sendKeys("Manna");
	    
	}

	@When("USer Put Valid LastName")
	public void u_ser_put_valid_last_name() {
		pf.getLastName().sendKeys("Deb");
	    
	}

	@When("User Put Valid Zip code")
	public void user_put_valid_zip_code() {
	   
		pf.getZipcode().sendKeys("30144");
	}

	@When("User Click on Continue")
	public void user_click_on_continue() {
	   
		pf.getContinue().click();
	}

	@When("User go to Checkout\\/OverReview page and click On Finish")
	public void user_go_to_checkout_over_review_page_and_click_on_finish() {
		pf.getClickOnFinish().click();
	    
	}

	@Then("User Displayed Thank You FOr Your Order Page Message")
	public void user_displayed_thank_you_f_or_your_order_page_message() {
	   
	    String expected = driver.findElement(By.xpath("//*[@class='complete-header']")).getText();
	    String Actual = driver.findElement(By.xpath("//*[@class='complete-header']")).getText();
	    Assert.assertEquals(expected,Actual );
	}

	@When("User Click on Menu bar")
	public void user_click_on_menu_bar() {
		pf.getMenubar().click();
		
	    
	}

	@When("User Click on Logout  button")
	public void user_click_on_logout_button() {
	  pf.getLogout().click();
	}

	@Then("User should Successfully Log out")
	public void user_should_successfully_log_out() {
	    
	   
	}

}
