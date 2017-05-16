package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountHeaderPage extends AbstractPage{

	By notificationsLocator = By.id("notifications");

	public AccountHeaderPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public String signedInConfirmation(){
		return driver.findElement(By.className("message-text")).getText();
	}

	public void clickAvatar() {
		waitForElementNotPresent(notificationsLocator);
		driver.findElement(By.className("header-user-avatar")).click();
	}

	public void logOut() {
		driver.findElement(By.linkText("Sign Out")).click();
	}
	
	public String getWarning() {
		return driver.findElement(By.className("message-text")).getText();
	}
	


}
