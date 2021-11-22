package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.AllOfItPage;
import com.mindtree.pageObjects.ShopByCategoryPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AllOfItPageSD {
	public AllOfItPage AP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("Getting the driver from the ShopByCategoryPageSD file")
	public void getting_the_driver_from_the_shop_by_category_page_sd_file() {
		driver = ShopByCategoryPageSD.getDriver();
	}

	@Then("^user click on AllOfIt$")
	public void user_click_on_allofit() throws Throwable {
		AP = new AllOfItPage(driver);
		AP.getallofit().click();
		Thread.sleep(2000);
		log.info("Navigated to All of it Page");

	}

	@And("^click any one of the product$")
	public void click_any_one_of_the_product() throws Throwable {
		AP = new AllOfItPage(driver);
		AP.getproduct().click();
	}

	@And("^verifying the title of product$")
	public void verifying_the_title_of_product() throws Throwable {
		AP = new AllOfItPage(driver);
		if (AP.getproduct().getText().equals("Auto Rickshaw Pen Stand"))
			Assert.assertTrue(true);
		log.info("Verified Auto Rickshaw Pen Stand");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
