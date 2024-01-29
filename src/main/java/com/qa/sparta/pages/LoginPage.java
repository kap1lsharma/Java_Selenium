package com.qa.sparta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.sparta.utils.ElementUtils;

//This whole class is an example of encapsulation 
//since we are using private locator in public methods

public class LoginPage {

	private WebDriver driver;
	private ElementUtils eleUtil;

	// By Locators - Page Locators
	private By emailID = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By CtnBtn = By.xpath("//label[text()=' Continue']");
	private By frgtPswLink = By.xpath("//a[text()='Forgot password?']");
	// private By DashboardPage = By.xpath("//h1[text()='API Explorer']");

	// Public Page Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
	}

	// Page Actions/methods
	public String getPageTitle() {

		String Title = eleUtil.waitForTitleIs("Sparta", 5);
		System.out.println("Login Page Title is : " + Title);
		return Title;
	}

	public String getPageURL() {
		String URL = eleUtil.waitForURLContains("sparta.satsure", 5);
		System.out.println("Login Page URL is : " + URL);
		return URL;
	}

	public boolean isfrgtPswLinkExists() {

		return eleUtil.waitForElementVisible(frgtPswLink, 10).isDisplayed();
	}

	public String doLogin(String email, String pswrd) throws InterruptedException {

		System.out.println("Login cred are " + email + " : " + pswrd);
		eleUtil.waitForElementVisible(emailID, 10).sendKeys(email);
		Thread.sleep(2000);

		eleUtil.doSendKeys(password, pswrd);
		Thread.sleep(2000);
		eleUtil.doClick(CtnBtn);
		return eleUtil.waitForTitleIs("sparta", 10);

//		driver.findElement(DashboardPage).isDisplayed();

	}

}
