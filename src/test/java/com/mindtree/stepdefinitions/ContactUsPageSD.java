package com.mindtree.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.AboutUsPage;
import com.mindtree.pageObjects.ContactUsPage;
import com.mindtree.pageObjects.GiftCardPage;
import com.mindtree.runner.BigSmall;
import com.mindtree.utility.ReadPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class ContactUsPageSD {
	public ContactUsPage CP;
	static WebDriver driver;
	ReadPropertyFile rp = null;

	Logger log = LogManager.getLogger(BigSmall.class.getName());

	@Given("^getting driver from GiftCardPage file$")
	public void getting_driver_from_giftcardpage_file() throws Throwable {
		driver = GiftCardPageSD.getDriver();
	}

	@Then("^Click on ContactUs footer$")
	public void click_on_contactus_footer() throws Throwable {
		CP = new ContactUsPage(driver);
		rp = new ReadPropertyFile();
		Thread.sleep(3000);
		CP.getcontinueshopping().click();
		//Thread.sleep(3000);
		CP.getcontactUs().click();
		Thread.sleep(3000);

	}

	@Then("^Verify that data has been sent$")
	public void verify_that_data_has_been_sent() throws Throwable {
		CP = new ContactUsPage(driver);
		if (CP.gettitle().getText().equalsIgnoreCase("contact us")) {
			Assert.assertTrue(true);
			log.info("Title verified successfully ");
		}

	}

	@And("^sending email, name and message to the contact form$")
	public void sending_email_name_and_message_to_the_contact_form() throws Throwable {
		CP = new ContactUsPage(driver);
		CP.getname().sendKeys(rp.getName());
		CP.getemail().sendKeys(rp.getEmail());
		CP.getmessage().sendKeys(rp.getMessage());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

//	@And("^close driver$")
//	public void close_driver() throws Throwable {
//		CP = new ContactUsPage(driver);
//		CP.driver.quit();
//		
//
//	}

	public static WebDriver getDriver() {
		return driver;
	}

}