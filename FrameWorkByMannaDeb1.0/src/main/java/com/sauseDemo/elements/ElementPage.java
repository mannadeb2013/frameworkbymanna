package com.sauseDemo.elements;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauseDemoBasePage.BaseClass1;

public class ElementPage extends BaseClass1{
	
	public ElementPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='input_error form_input'])[1]")
	private WebElement Username;
    public WebElement getUsername() {
		return Username;
	}
    @FindBy(xpath="(//input[@class='input_error form_input'])[2]")
    private WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(xpath= "//*[@type='submit']")
	private WebElement SubmitButton;
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	
	@FindBy(xpath= "(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
	private WebElement Backpack;
	public WebElement getBackpack() {
		return Backpack;
	}
	
	@FindBy(xpath="//*[@class='shopping_cart_link']")
	private WebElement ShoppingCart;
	public WebElement getShoppingCart() {
		return ShoppingCart;
	}
	
	@FindBy(name="checkout")
	private WebElement CheckOutButton;
	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	
	@FindBy(xpath="//*[@placeholder='First Name']")
	private WebElement FirstName;
	public WebElement getFirstName() {
		return FirstName;
	}
	
	@FindBy(xpath="//*[@placeholder='Last Name']")
	private WebElement LastName;
	public WebElement getLastName() {
		return LastName;
	}
	
	@FindBy(xpath="//*[@placeholder='Zip/Postal Code']")
	private WebElement Zipcode;
	public WebElement getZipcode() {
		return Zipcode;
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
	
	@FindBy(id="finish")
	private WebElement clickOnFinish;
	public WebElement getClickOnFinish() {
		return clickOnFinish;
	}
	
	@FindBy(xpath="//*[@id='react-burger-menu-btn']")
	private WebElement Menubar;
	public WebElement getMenubar() {
		return Menubar;
	}
	
	@FindBy(xpath="//*[@id='logout_sidebar_link']")
	private WebElement Logout;
	public WebElement getLogout() {
		return Logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
