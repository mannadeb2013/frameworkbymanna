package com.nocommerce.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NopCommerce.Basepage.BaseProjectClass;

public class elementPage extends BaseProjectClass{
	
	public  elementPage(){
		PageFactory.initElements(driver, this);
		 
	 }
	@FindBy(xpath="//a[@class='ico-register']")
 private WebElement registerbutton;
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	@FindBy(xpath="//input[@value='M']")
private WebElement  gender;
	public WebElement getGender() {
		return gender;
	}	
}
