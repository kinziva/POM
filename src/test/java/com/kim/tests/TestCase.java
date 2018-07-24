package com.kim.tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.kim.pages.LoginPage;
import com.kim.utilities.Driver;
import com.kim.utilities.configReader;


public class TestCase extends TestBase{


	protected LoginPage loginpage= new LoginPage();
		
	@Test
	public void testHomePage() {
		assertTrue(loginpage.isAt());
		driver.get(configReader.getProperty("url"));
		loginpage.name.sendKeys(configReader.getProperty("name"));
		loginpage.lastname.sendKeys(configReader.getProperty("lname"));
		loginpage.address.sendKeys(configReader.getProperty("address"));
		loginpage.zip.sendKeys(configReader.getProperty("zip"));
		loginpage.signupButton.click();
	}
}
