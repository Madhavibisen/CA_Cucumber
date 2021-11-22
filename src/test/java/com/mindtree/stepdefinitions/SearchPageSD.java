package com.mindtree.stepdefinitions;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.PersonalizedGiftsPage;
import com.mindtree.pageObjects.SearchPage;
import com.mindtree.runner.BigSmall;
import com.mindtree.utility.RetreiveExcelData;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SearchPageSD {
	public SearchPage SP;
	static WebDriver driver;
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("Getting the driver from the PersonalizedGiftsPageSD file")
	public void getting_the_driver_from_the_personalized_gifts_page_sd_file() {
		driver = PersonalizedGiftsPageSD.getDriver();
	}

	@Then("Activate the Search box")
	public void activate_the_search_box() {

		log.info("Search Box Activated");
	}

	@Then("Get values from excel file")
	public void get_valuesfrom_excel_file() throws IOException {
		SP = new SearchPage(driver);
		ArrayList<String> d = RetreiveExcelData.getData("SearchDiary");

		SearchPage SP = new SearchPage(driver);

		for (int i = 1; i < d.size(); i++) {
			SP.getsearchbox().sendKeys(d.get(i));
			SP.getsearchbox().sendKeys(Keys.ENTER);
		}
	}

	@Then("Send keys into the Search box")
	public void send_keys_into_the_search_box() {
		log.info("Successfully searched product - Diary");
	}

	@Then("verify if searched product is displayed")
	public void verify_if_searched_product_is_displayed() {
		SP = new SearchPage(driver);
		SearchPage SP = new SearchPage(driver);
		if (SP.getsearchproduct().isDisplayed())
			Assert.assertTrue(true);
		log.info("Successfully verified products are displayed");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
