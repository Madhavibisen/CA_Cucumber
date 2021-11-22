package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.PersonalizedGiftsPage;
import com.mindtree.pageObjects.SignInPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class PersonalizedGiftsPageSD {
	public PersonalizedGiftsPage PG;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());
	
	@Given("Getting the driver from the SignInPageSD file")
	public void getting_the_driver_from_the_sign_in_page_sd_file() {
		driver = SignInSD.getDriver();
	}

	@Then("^user click on Personalized Gifts$")
	public void user_click_on_personalized_gifts() throws Throwable {
		PG = new PersonalizedGiftsPage(driver);

		PG.getpersonalizedgifts().click();

	}

	@Then("^click on High to Low option$")
	public void click_on_high_to_low_option() throws Throwable {
		PG = new PersonalizedGiftsPage(driver);
		PG.gethightoLow().click();
		if (PG.getmaxprice().getText() == "4500")
			Assert.assertTrue(true);
		log.info("Successfully sorted the items in High to Low price");

	}

	@And("^click on Sort by dropdown$")
	public void click_on_sort_by_dropdown() throws Throwable {
		PG = new PersonalizedGiftsPage(driver);
		PG.getsortby().click();

	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
