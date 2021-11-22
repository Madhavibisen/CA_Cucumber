package com.mindtree.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.ChristmasGiftsPageUI;

public class ChristmasGiftsPage {

	public WebDriver driver;

	public ChristmasGiftsPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getchristmasgift() {
		return driver.findElement(ChristmasGiftsPageUI.christmasgift);
	}

	public WebElement getfirstproduct() {
		return driver.findElement(ChristmasGiftsPageUI.firstproduct);
	}

	public WebElement getaddtocart() {
		return driver.findElement(ChristmasGiftsPageUI.addtocart);
	}

	public WebElement getcheckout() {
		return driver.findElement(ChristmasGiftsPageUI.checkout);
	}

	public WebElement getclosepopup() {
		return driver.findElement(ChristmasGiftsPageUI.closepopup);
	}

	public WebElement getreturntocart() {
		return driver.findElement(ChristmasGiftsPageUI.returntocart);
	}

}
