package com.mindtree.stepdefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponent.WebDriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LandingPageSD {
	static WebDriver driver;

	@Given("^User Launch the Chrome Browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
	}

	@When("^user opens the URL \"([^\"]*)\"$")
	public void user_opens_the_url_something(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	public static WebDriver getDriver() {
		return driver;
	}

}