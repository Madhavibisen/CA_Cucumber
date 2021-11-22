package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.GiftCardPageUI;

public class GiftCardPage {

	public WebDriver driver;

	public GiftCardPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getgiftcard() {
		return driver.findElement(GiftCardPageUI.giftcard);
	}

	public WebElement getaddtocart() {
		return driver.findElement(GiftCardPageUI.addtocart);
	}

	public WebElement gettitle() {
		return driver.findElement(GiftCardPageUI.title);
	}

}
