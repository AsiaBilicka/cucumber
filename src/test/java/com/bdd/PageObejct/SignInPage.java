package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInPage extends AbstractPage{
	public SignInPage(WebDriver driver){
		super(driver);
	}
	
	public SignInPage setEmail(String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
		return new SignInPage(driver);
	}
	
	public SignInPage setPassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
		return new SignInPage(driver);
	}
	
	public String getWarning(){
		return driver.findElement(By.className("message-text")).getText();
	}
	
	public AccountHeaderPage submitForm() {
		driver.findElement(By.id("btn-signin")).click();
		return new AccountHeaderPage(driver);
	}
}
