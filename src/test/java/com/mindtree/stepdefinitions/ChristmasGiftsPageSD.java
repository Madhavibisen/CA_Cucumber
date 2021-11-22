
package com.mindtree.stepdefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.ChristmasGiftsPage;
import com.mindtree.pageObjects.SearchPage;
import com.mindtree.runner.BigSmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class ChristmasGiftsPageSD {
	public ChristmasGiftsPage CG;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("Getting the driver from the SearchPageSD file")
	public void getting_the_driver_from_the_search_page_sd_file() {
		driver = SearchPageSD.getDriver();
	}

	@Then("^user click on click on Christmas menu$")
	public void user_click_on_click_on_christmas_menu() throws Throwable {
		CG = new ChristmasGiftsPage(driver);
		CG.getchristmasgift().click();
		Thread.sleep(5000);
	}

	@Then("^click on Go to Checkout$")
	public void click_on_go_to_checkout() throws Throwable {
		CG = new ChristmasGiftsPage(driver);

		CG.getcheckout().click();
		Thread.sleep(2000);
		if (CG.getclosepopup().isDisplayed())
			CG.getclosepopup().click();
	}

	@And("^click on first product$")
	public void click_on_first_product() throws Throwable {
		CG = new ChristmasGiftsPage(driver);

		CG.getfirstproduct().click();

	}

	@And("^click on  Add to Cart$")
	public void click_on_add_to_cart() throws Throwable {
		CG = new ChristmasGiftsPage(driver);

		CG.getaddtocart().click();
		Thread.sleep(5000);
		log.info("Added product to the cart");
	}

	@And("^click on Return to cart$")
	public void click_on_return_to_cart() throws Throwable {
		CG = new ChristmasGiftsPage(driver);

		CG.getreturntocart().click();
		Thread.sleep(1000);
		log.info("Proceeeded to checkout and returned to cart");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}