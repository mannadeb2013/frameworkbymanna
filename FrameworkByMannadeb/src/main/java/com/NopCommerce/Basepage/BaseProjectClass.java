package com.NopCommerce.Basepage;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.NopCommerce.Utils.Nop_utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseProjectClass {
	public static WebDriver driver;

	public static String name = " mannaaa21@gmail.com";
	public static String pass = "865790";

	public static void Browserlaunch()  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.nopcommerce.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Manna");
		driver.findElement(By.id("LastName")).sendKeys("Deb");
		driver.findElement(By.id("Email")).sendKeys(name);

		Select Date = new Select(driver.findElement(By.name("DateOfBirthDay")));
		Date.selectByVisibleText("3");
		Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		Month.selectByVisibleText("November");
		Select Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		Year.selectByVisibleText("1990");

		driver.findElement(By.id("Company")).sendKeys("SmartTech");
		driver.findElement(By.id("Newsletter"));
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//a[@class='button-1 register-continue-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();

		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys(name);
		driver.findElement(By.id("Password")).sendKeys("Manna2013");
		Nop_utilities.getHighLighter(driver.findElement(By.id("Email")));
		Nop_utilities.getHighLighter(driver.findElement(By.id("Password")));
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("computer", Keys.ENTER);
		driver.findElement(By.linkText("Build your own computer")).click();

		Select s = new Select(driver.findElement(By.name("product_attribute_1")));
		s.selectByVisibleText("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");

		Select s1 = new Select(driver.findElement(By.name("product_attribute_2")));
		s1.selectByVisibleText("2 GB");

		driver.findElement(By.xpath("//label[@for='product_attribute_3_7']")).click();
		driver.findElement(By.xpath("//label[@for='product_attribute_4_9']")).click();
		driver.findElement(By.xpath("//label[@for='product_attribute_5_10']")).click();
		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();

		driver.findElement(By.xpath("//span[@class='close']")).click();

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("topcartlink"))).build().perform();
		driver.findElement(By.xpath("//button[@class=\"button-1 cart-button\"]")).click();*/
		
		
		
		
	
	
		

		

		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

		

		
		
		
		
		
		
		

		
	
		
	
		
		
		

		
		

		//driver.findElement(By.xpath("//span[@class='close']")).click();
		
		
		
		

	}

	public static void main(String[] args) {
		BaseProjectClass.Browserlaunch();
	}
}
