package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.ChristmasGiftsPage;
import com.mindtree.pageObjects.ShopByCategoryPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class ShopByCategoryPageSD {
	public ShopByCategoryPage SC;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("Getting the driver from the ChristmasGiftsPageSD file")
	public void getting_the_driver_from_the_christmas_gifts_page_sd_file() {
		driver = ChristmasGiftsPageSD.getDriver();
	}

	@Then("^user click on Shop By Category menu$")
	public void user_click_on_shop_by_category_menu() throws Throwable {
		SC = new ShopByCategoryPage(driver);

		SC.getshopbycategory().click();
		Thread.sleep(3000);
	}

	@Then("^click the first product$")
	public void click_the_first_product() throws Throwable {
		SC = new ShopByCategoryPage(driver);

		SC.getfirstproduct().click();
		Thread.sleep(3000);
	}

	@And("^click any one of the category$")
	public void click_any_one_of_the_category() throws Throwable {
		SC = new ShopByCategoryPage(driver);

		SC.getbirthdaygift().click();

	}

	@And("^click on Add to Wishlist$")
	public void click_on_add_to_wishlist() throws Throwable {
		SC = new ShopByCategoryPage(driver);

		SC.getaddtowishlist().click();
		Thread.sleep(500);
		if (SC.getviewwishlist().isDisplayed())
			Assert.assertTrue(true);
		log.info("Items added to the wishlist");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}