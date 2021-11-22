package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.SearchPageUI;

public class SearchPage {

	public WebDriver driver;

	public SearchPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getsearchbox() {
		return driver.findElement(SearchPageUI.searchbox);
	}

	public WebElement getsearchproduct() {
		List<WebElement> list = driver.findElements(SearchPageUI.searchproduct);
		return list.get(0);
	}

}
