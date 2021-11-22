package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.ShopByCategoryPageUI;

public class ShopByCategoryPage {

	public WebDriver driver;

	public ShopByCategoryPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getshopbycategory() {
		List<WebElement> List = driver.findElements(ShopByCategoryPageUI.shopbycategory);
		return List.get(3);
	}

	public WebElement getbirthdaygift() {
		List<WebElement> List = driver.findElements(ShopByCategoryPageUI.birthdaygift);
		return List.get(1);
	}

	public WebElement getfirstproduct() {
		return driver.findElement(ShopByCategoryPageUI.firstproduct);
	}

	public WebElement getaddtowishlist() {
		return driver.findElement(ShopByCategoryPageUI.addtowishlist);
	}

	public WebElement getviewwishlist() {
		return driver.findElement(ShopByCategoryPageUI.viewwishlist);
	}

}
