package com.nocommerce.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.NopCommerce.Basepage.BaseProjectClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAndCheckout extends BaseProjectClass{
	@When("User click on search box and search for computers")
	public void user_click_on_search_box_and_search_for_computers() {
	  
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("computer", Keys.ENTER);
	}

	@Then("user can search for computers")
	public void user_can_search_for_computers() {
	  
	   
	}

	@When("User click on Build your own computer")
	public void user_click_on_build_your_own_computer() {
	  
		driver.findElement(By.linkText("Build your own computer")).click();
	}

	@When("user select the processor,RAM,HDD,OS,Software")
	public void user_select_the_processor_ram_hdd_os_software() {
	  
		Select s = new Select(driver.findElement(By.name("product_attribute_1")));
		s.selectByVisibleText("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");

		Select s1 = new Select(driver.findElement(By.name("product_attribute_2")));
		s1.selectByVisibleText("2 GB");

		driver.findElement(By.xpath("//label[@for='product_attribute_3_7']")).click();
		driver.findElement(By.xpath("//label[@for='product_attribute_4_9']")).click();
		driver.findElement(By.xpath("//label[@for='product_attribute_5_10']")).click();
	}

	@When("User click on the add to cart")
	public void user_click_on_the_add_to_cart() {
		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
	   
	}

	@Then("User is success to customize the computer and able to add the computer to the cart")
	public void user_is_success_to_customize_the_computer_and_able_to_add_the_computer_to_the_cart() {
	  
	   
	}

	@When("User mouse over Shoping Cart and Click go to cart")
	public void user_mouse_over_shoping_cart_and_click_go_to_cart() {
	  
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("topcartlink"))).build().perform();
		driver.findElement(By.xpath("//button[@class=\"button-1 cart-button\"]")).click();
	}

	@When("User click on the Terms and Codition box")
	public void user_click_on_the_terms_and_codition_box() {
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	   
	}

	@When("User click on Checkout button")
	public void user_click_on_checkout_button() {
		driver.findElement(By.xpath("(//button[@type='submit'])[6]")).click();
	   
	}

	@When("User fill up all the requirement Boxes")
	public void user_fill_up_all_the_requirement_boxes() {
	  
		Select s2 = new Select(driver.findElement(By.xpath("//select[@data-trigger=\"country-select\"]")));
		s2.selectByVisibleText("United States");
		
		Select s3 =  new Select(driver.findElement(By.xpath("//select[@data-trigger=\"state-select\"]")));
		s3.selectByVisibleText("Georgia");
		
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Kennesaw");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("101 club house dr");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("30144");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456");
	}

	@When("User Click on Continue Button")
	public void user_click_on_continue_button() {
	  
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	}

	@When("User select Shipping Ground and Click Continue botton")
	public void user_select_shipping_ground_and_click_continue_botton() {
	  
	   
	}

	@When("User Select Payment method and Click on Continue botton")
	public void user_select_payment_method_and_click_on_continue_botton() {
	  
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	}

	@When("User Click Continue2 botton")
	public void user_click_continue2_botton() {
	  
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
	}

	@When("User Click on Confirm bottom")
	public void user_click_on_confirm_bottom() {
	  
		driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
	}

	@Then("User Can see Order Successfully processed message")
	public void user_can_see_order_successfully_processed_message() {
	  
	   
	}

	@Then("User Click on Continue3 botton")
	public void user_click_on_continue3_botton() {
		driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']")).click();
	   
	}

	@Then("User is able to checkout")
	public void user_is_able_to_checkout() {
	  
	   
	}
}
