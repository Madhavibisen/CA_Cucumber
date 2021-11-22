package com.mindtree.appUIStrore;

import org.openqa.selenium.By;

public class ChristmasGiftsPageUI {

	public static By christmasgift = By.linkText("Christmas Gifts");

	public static By firstproduct = By.xpath("//*[@class='grid-product__title']");

	public static By addtocart = By.xpath("//*[@name='add']");

	public static By verifyproduct = By.xpath("//*[@class='cart__product-name']");

	public static By checkout = By.xpath("//*[@name='checkout']");

	public static By closepopup = By.xpath("//*[@class='wa-optin-widget-close-img']");

	public static By returntocart = By.className("step__footer__previous-link-content");

}