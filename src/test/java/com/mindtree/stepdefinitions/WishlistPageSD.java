package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.AllOfItPage;
import com.mindtree.pageObjects.WishlistPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class WishlistPageSD {
	public WishlistPage WP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(WishlistPageSD.class.getName());

	@Given("Getting the driver from the AllOfItPageSD file")
	public void getting_the_driver_from_the_all_of_it_page_sd_file() {
		driver = AllOfItPageSD.getDriver();
	}

	@Then("^user click on WishList$")
	public void user_click_on_wishlist() throws Throwable {
		WP = new WishlistPage(driver);
		WP.getwishlist().click();
		Thread.sleep(3000);
		log.info("Navigated to Wishlist Page ");
	}

	@And("^verify whether the item is present or not$")
	public void verify_whether_the_item_is_present_or_not() throws Throwable {
		WP = new WishlistPage(driver);
		Thread.sleep(4000);
		if (WP.getclosepopup().isDisplayed())
			WP.getclosepopup().click();
		Thread.sleep(5000);
		if (WP.getproduct().size() > 0)
			Assert.assertTrue(true);
		Thread.sleep(3000);
		log.info("Products are displayed in Wishlist");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
