package com.mindtree.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.ContactUsPageUI;

public class ContactUsPage {

	public WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getcontactUs() {
		return driver.findElement(ContactUsPageUI.contactUs);
	}

	public WebElement getmessage() {
		return driver.findElement(ContactUsPageUI.message);
	}

	public WebElement getname() {
		return driver.findElement(ContactUsPageUI.name);
	}

	public WebElement getemail() {
		return driver.findElement(ContactUsPageUI.email);
	}

	public WebElement getsend() {
		return driver.findElement(ContactUsPageUI.send);
	}

	public WebElement gettitle() {
		return driver.findElement(ContactUsPageUI.title);
	}

	public WebElement getcontinueshopping() {
		return driver.findElement(ContactUsPageUI.continueshopping);
	}

}
