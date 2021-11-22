package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.PersonalizedGiftsPageUI;

public class PersonalizedGiftsPage {

	public WebDriver driver;

	public PersonalizedGiftsPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getpersonalizedgifts() {
		return driver.findElement(PersonalizedGiftsPageUI.PersonalizedGifts);
	}

	public WebElement getsortby() {
		return driver.findElement(PersonalizedGiftsPageUI.sortby);
	}

	public WebElement gethightoLow() {
		return driver.findElement(PersonalizedGiftsPageUI.HightoLow);
	}

	public WebElement getmaxprice() {
		return driver.findElement(PersonalizedGiftsPageUI.maxprice);
	}

}
