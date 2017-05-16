package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage extends AbstractPage{
	public SignInPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public void setEmail(String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}
	
	public void submitForm() {
		driver.findElement(By.id("btn-signin")).click();
	}
}
