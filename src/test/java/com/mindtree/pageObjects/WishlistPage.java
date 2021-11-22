package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.WishlistPageUI;

public class WishlistPage {
	public WebDriver driver;

	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getwishlist() {
		return driver.findElement(WishlistPageUI.wishlist);
	}

	public List<WebElement> getproduct() {
		return driver.findElements(WishlistPageUI.product);

	}

	public WebElement getclosepopup() {
		List<WebElement> list = driver.findElements(WishlistPageUI.popup);
		return list.get(2);
	}
}
