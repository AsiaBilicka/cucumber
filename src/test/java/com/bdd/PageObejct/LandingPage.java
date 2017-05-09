package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends AbstractPage{
	public LandingPage(WebDriver driver){
		super(driver);
	}
	
	public SignInPage navigateToSignInPage(String linkText){
		driver.findElement(By.linkText(linkText)).click();
		return new SignInPage(driver);
	}

	public SignInPage navigateToAccount(String url) {
		driver.navigate().to("http://courses.ultimateqa.com/account");
		return new SignInPage(driver);
	}


}
