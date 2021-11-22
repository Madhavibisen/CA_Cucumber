//package com.mindtree.uistore;
//
//import org.openqa.selenium.By;
//
//public class SignInPageUI {
//	
//	public static By email = By.id("CustomerEmail");
//	public static By password = By.id("CustomerPassword");
//	public static By SignInButton = By.cssSelector("input[type='submit']");
//
//}
package com.mindtree.appUIStrore;

import org.openqa.selenium.By;

public class SignInPageUI {
	public static By SignIn = By.cssSelector(".site-nav__link.site-nav__link--icon.signinlink");
	public static By email = By.id("CustomerEmail");
	public static By password = By.id("CustomerPassword");
	public static By Submit = By.cssSelector("input[type='submit']");;

}