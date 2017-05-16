package com.bdd.PageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends AbstractPage{
	public LandingPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public void navigateToAccount(String url) {
		driver.navigate().to("http://courses.ultimateqa.com/account");
	}


}
