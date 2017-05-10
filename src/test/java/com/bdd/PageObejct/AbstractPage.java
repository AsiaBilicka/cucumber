package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public AbstractPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public LandingPage navigateToWebApp(String url) {
		driver.navigate().to(url);
		return new LandingPage(driver, wait);
	}

	public void waitForElementNotPresent(By by){
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
}
