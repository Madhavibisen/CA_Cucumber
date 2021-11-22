package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.appUIStrore.AllofitUI;

public class AllOfItPage {

	public WebDriver driver;

	public AllOfItPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getallofit() {
		return driver.findElement(AllofitUI.allofit);
	}

	public WebElement getproduct() {
		return driver.findElement(AllofitUI.firstproduct);
	}

}
