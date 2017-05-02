package com.bdd.PageObejct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

public class SignInPage extends AbstractPage{
	public SignInPage(WebDriver driver){
		super(driver);
	}
	
	public SignInPage setEmail(DataTable table){
		List<List<String>> data = table.raw();
		driver.findElement(By.id("user_email")).sendKeys(data.get(1).get(1));
		return new SignInPage(driver);
	}
	
	public SignInPage setPassword(DataTable table){
		List<List<String>> data = table.raw();
		driver.findElement(By.id("user_password")).sendKeys(data.get(2).get(1));
		return new SignInPage(driver);
	}
	
	public String getWarning(){
		return driver.findElement(By.className("notifications-error__list-item")).getText();
	}
	
	public CollectionsPage submitForm(){
		driver.findElement(By.id("btn-signin")).click();
		return new CollectionsPage(driver);
	}
}
