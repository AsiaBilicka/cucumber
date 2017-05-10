package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountHeaderPage extends AbstractPage{
	public AccountHeaderPage(WebDriver driver){
		super(driver);
	}
	
	public String signedInConfirmation(){
		return driver.findElement(By.className("message-text")).getText();
	}

	public AccountHeaderPage clickAvatar() {
		driver.findElement(By.className("header-user-avatar")).click();
		return new AccountHeaderPage(driver);
		
	}

	public AccountHeaderPage logOut() {
		driver.findElement(By.linkText("Sign Out")).click();
		return new AccountHeaderPage(driver);
		
	}
	
	
}
