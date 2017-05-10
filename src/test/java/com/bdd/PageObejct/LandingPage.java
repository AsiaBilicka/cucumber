package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends AbstractPage{
	public LandingPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public SignInPage navigateToSignInPage(String linkText){
		driver.findElement(By.linkText(linkText)).click();
		return new SignInPage(driver, wait);
	}

	public SignInPage navigateToAccount(String url) {
		driver.navigate().to("http://courses.ultimateqa.com/account");
		return new SignInPage(driver, wait);
	}


}
