package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.GiftCardPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class GiftCardPageSD {
	public GiftCardPage GP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("Getting the driver from the AboutUsPageSD file")
	public void getting_the_driver_from_the_about_us_page_sd_file() {
		GP = new GiftCardPage(driver);

		driver = AboutUsPageSD.getDriver();
	}

	@Then("^user click on GiftCard$")
	public void user_click_on_giftcard() throws Throwable {
		GP = new GiftCardPage(driver);
		GP.getgiftcard().click();
		log.info("Navigated to Gift Cards Page");
	}

	@And("^click on Add to Cart$")
	public void click_on_add_to_cart() throws Throwable {
		GP = new GiftCardPage(driver);

		GP.getaddtocart().click();
		Thread.sleep(3000);
		log.info("Added Gift Card to cart");
		Thread.sleep(6000);
		log.info(GP.gettitle().getText());
		if (GP.gettitle().getText().contains("Standard delivery")) {
			Assert.assertTrue(true);
			log.info("Cart Verified Successfully ");
		} else {
			Assert.assertTrue(false);
			log.info("Not Verified");
		}

	}

	public static WebDriver getDriver() {

		return driver;
	}

}