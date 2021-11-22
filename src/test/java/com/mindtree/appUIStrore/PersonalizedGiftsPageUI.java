package com.mindtree.appUIStrore;

import org.openqa.selenium.By;

public class PersonalizedGiftsPageUI {
	public static By PersonalizedGifts = By.linkText("Personalized Gifts");
	public static By sortby = By.id("sortBy");
	public static By HightoLow = By.xpath("//*[@id=\'sortBy\']/option[7]");
	public static By maxprice = By.xpath("//*[@class='money']");

}
