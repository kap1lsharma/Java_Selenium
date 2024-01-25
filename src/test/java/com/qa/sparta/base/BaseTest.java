package com.qa.sparta.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.sparta.pages.LoginPage;

public class BaseTest {
	
	WebDriver driver;
	protected LoginPage loginPage;  //This is protected to use this out side of package
		
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://beta.sparta.satsure.co/");	
		loginPage = new LoginPage(driver);
		
	}
	
	@AfterTest
	public void quit() {		
		driver.quit();		
	}
	
	
	

}
