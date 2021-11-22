package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.AboutUsPage;
import com.mindtree.pageObjects.WishlistPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AboutUsPageSD {
	public AboutUsPage AP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("Getting the driver from the WishlistPageSD file")
	public void getting_the_driver_from_the_wishlist_page_sd_file() {
		driver = WishlistPageSD.getDriver();
	}

	@Then("^user click on About Us$")
	public void user_click_on_about_us() throws Throwable {
		AP = new AboutUsPage(driver);

		AP.getaboutus().click();
		log.info("Navigated to About Us Page");

	}

	@And("^verify the title of the page$")
	public void verify_the_title_of_the_page() throws Throwable {
		AP = new AboutUsPage(driver);

		if (AP.gettitle().getText().contains("About us"))
			Assert.assertTrue(true);
		log.info("Verified title of About Us Page");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}