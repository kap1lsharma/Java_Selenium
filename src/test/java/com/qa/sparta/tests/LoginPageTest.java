package com.qa.sparta.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.sparta.base.BaseTest;

//This class is there for Initiating the run
//This will the start the execution of the script

public class LoginPageTest extends BaseTest {

	// Verifying the Page Title
	@Test(priority = 1)
	public void LoginPageTitleTest() {

		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, "Sparta");

	}

	// Verifying the Page URL
	@Test(priority = 2)
	public void LoginPageURLTest() {

		String actualURL = loginPage.getPageURL();
		Assert.assertTrue(actualURL.contains("//beta.sparta.satsure"));
	}

//    Verifying the Forgot password Link
	@Test(priority = 3)
	public void forgePassLink() {

		Assert.assertTrue(loginPage.isfrgtPswLinkExists());
	}

//    Verifying the login Functionality
	@Test(priority = 4)
	public void LoginTest() throws InterruptedException {

		String LoggedPageTitle = loginPage.doLogin("kuralarasan1094@gmail.com", "Kural@10");
		Assert.assertEquals(LoggedPageTitle, "Sparta");

	}

}
