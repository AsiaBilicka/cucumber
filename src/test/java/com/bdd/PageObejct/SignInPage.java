package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage extends AbstractPage{
	public SignInPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public SignInPage setEmail(String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
		return new SignInPage(driver, wait);
	}
	
	public SignInPage setPassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
		return new SignInPage(driver, wait);
	}
	
	public AccountHeaderPage submitForm() {
		driver.findElement(By.id("btn-signin")).click();
		return new AccountHeaderPage(driver, wait);
	}
}
