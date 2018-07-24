package com.kim.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.kim.utilities.Driver;
import com.kim.utilities.configReader;

public class TestBase {
	protected WebDriver driver;
	protected  Actions actions;
	
	@BeforeMethod
	public void setUp() {
		driver = Driver.getDriver();
	//	actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
		driver.get(configReader.getProperty("url"));

	}
	
	@AfterMethod
	public void tearDown() {
		Driver.closeDriver();
	}

}
