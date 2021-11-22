package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.AboutUsPageUI;

public class AboutUsPage {

	public WebDriver driver;

	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getaboutus() {
		return driver.findElement(AboutUsPageUI.aboutus);
	}

	public WebElement gettitle() {
		return driver.findElement(AboutUsPageUI.title);
	}

}
