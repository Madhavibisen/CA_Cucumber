package com.mindtree.appUIStrore;

import org.openqa.selenium.By;

public class ContactUsPageUI {
	public static By contactUs = By.linkText("Contact us");

	public static By message = By.id("ContactFormMessage-page-contact-template-0");

	public static By name = By.id("ContactFormName-page-contact-template-0");

	public static By email = By.id("ContactFormEmail-page-contact-template-0");
	
	public static By send = By.className("btn");

	public static By title = By.cssSelector(".section-header__title.appear-delay");
	
	public static By continueshopping = By.cssSelector(".drawer__close-button.js-drawer-close.btn.btn--secondary.btn--full.arrow-new1");

	
}
