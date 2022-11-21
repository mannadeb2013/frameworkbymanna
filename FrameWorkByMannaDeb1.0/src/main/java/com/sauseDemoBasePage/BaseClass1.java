package com.sauseDemoBasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sauseDemo.utils1.Utilities1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
	public static WebDriver driver;
	public static Properties property;
	public static Logger logger;
	
	public BaseClass1() {
		 logger = Logger.getLogger("Automation Testing");
		 PropertyConfigurator.configure("src/test/resources/Log4j.properties");
	}
   
	
	public static void initializeproperties() throws IOException {
	     property = new Properties();
		 InputStream ip = new FileInputStream("src/test/resources/config.properties");
		 property.load(ip);
	}
	
	
	public static void Setup() {
	if(property.getProperty("browserType").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();}
	else if (property.getProperty("browserType").equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}else if (property.getProperty("browserType").equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	            
	           // WebDriverManager.chromedriver().setup();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.saucedemo.com/");
				//driver.quit();
				
		  /*  And Two User Navigate to  "https://www.saucedemo.com/"
		driver.get("https://www.saucedemo.com/");
				
		  //  And Three User put Valid User Name
		driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("standard_user");
		Utilities1.getHighLighter(driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")))	;
				
		   //  And User put Valid  User Password
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
				Utilities1.getHighLighter(driver.findElement(By.xpath("//*[@id=\"password\"]")));
				
		   // And User User Click on Submit Button
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				




		
		   //Scenario: User is able to Add Product On the Cart 
		  // And User Click on The Sauce Labs Backpack
		driver.findElement(By.xpath("(//*[@class=\"btn btn_primary btn_small btn_inventory\"])[1]")).click();
				
		// And User Click on Shopping Cart 
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
				

		 // And User Clicks On CheckOut Botton 
		driver.findElement(By.name("checkout")).click();
				
		 // And User Put Valid FirstName
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Manna");
				
		 // And User Put Valid LastName
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Deb");
				
		 // And User Put Valid Zipe code
		driver.findElement(By.xpath("//*[@placeholder='Zip/Postal Code']")).sendKeys("30144");
				
		//User Click on Continue 
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
				
		// User go to Checkout/Review page and click 
		driver.findElement(By.id("finish")).click();
			
		 // Then User Displayed Thank You FOr Your Order Page Message
			
				
		  // When User Click on Menu bar
		driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
				
				
		 //  And User Click on Logout  botton
		driver.findElement(By.xpath("//*[@id='logout_sidebar_link']")).click();*/
				



		
	}
	
	/*public static void main(String[] args) {
		 BaseClass1.Setup();
		
	}*/

}
