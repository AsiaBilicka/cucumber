package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CollectionsPage extends AbstractPage{
	public CollectionsPage(WebDriver driver){
		super(driver);
	}
	
	public String signedInConfirmation(){
		return driver.findElement(By.className("message-text")).getText();
	}
	
	
}
