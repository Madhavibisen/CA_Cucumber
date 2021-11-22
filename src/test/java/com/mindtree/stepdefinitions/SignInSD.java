/*package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.SignInPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SignInSD {
	public SignInPage SP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("^Getting driver from the Landing Page of the application$")
	public void getting_driver_from_the_landing_page_of_the_application8() throws Throwable {
		driver = LandingPageSD.getDriver();
		Thread.sleep(5000);
	}

	@When("^user click on SignIn$")
	public void user_click_on_signin() throws Throwable {
		SP = new SignInPage(driver);
		SP.getSignIn().click();
	}

	@And("^User enters Email as \"([^\"])\" and Password as \"([^\"])\"$")
	public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
		SP = new SignInPage(driver);
		SP.getEmail().sendKeys(email);
		log.info(email + " entered");
		SP.getPassword().sendKeys(password);
		log.info(password + " entered");

	}

	@And("^Click on Submit$")
	public void click_on_submit() throws Throwable {
		SP = new SignInPage(driver);
		SP.getSubmit().click();

	}

	public static WebDriver getDriver() {
		return driver;
	}

}*/


package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.SignInPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SignInSD {
	public SignInPage SP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());


	@Given("^Getting driver from the Landing Page of the application$")
	public void getting_driver_from_the_landing_page_of_the_application8() throws Throwable {
		driver = LandingPageSD.getDriver();
		Thread.sleep(5000);
	}

	@When("^user click on SignIn$")
	public void user_click_on_signin() throws Throwable {
		SP = new SignInPage(driver);
		SP.getSignIn().click();
	}
	
	@And("^User enters Email as (.+) and Password as (.+)$")
	public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
		SP = new SignInPage(driver);
		SP.getEmail().clear();
		SP.getEmail().sendKeys(email);
		log.info(email + " entered");
		SP.getPassword().clear();
		SP.getPassword().sendKeys(password);
		log.info(password + " entered");

	}

//	@And("^User enters Email as \"([^\"])\" and Password as \"([^\"])\"$")
//	public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
//		SP = new SignInPage(driver);
//		SP.getEmail().clear();
//		SP.getEmail().sendKeys(email);
//		log.info(email + " entered");
//		SP.getPassword().clear();
//		SP.getPassword().sendKeys(password);
//		log.info(password + " entered");
//
//	}

	@And("^Click on Submit$")
	public void click_on_submit() throws Throwable {
		SP = new SignInPage(driver);
		SP.getSubmit().click();

	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}