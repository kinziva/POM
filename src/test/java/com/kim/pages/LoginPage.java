package com.kim.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kim.utilities.Driver;


public class LoginPage {

		private WebDriver driver;

		public LoginPage() {
			this.driver = Driver.getDriver();
			PageFactory.initElements(driver, this);
		}

		public boolean isAt() {
			return driver.getTitle().equals("Sign up");
		}

		@FindBy(css = "#firstname")
		public WebElement name;
		
		@FindBy(css = "#lastname")
		public WebElement lastname;
		
		@FindBy(css = "#address")
		public WebElement address;
		
		@FindBy(css = "#zipcode")
		public WebElement zip;
		
		@FindBy(css = "#signup")
		public WebElement signupButton;

	}

