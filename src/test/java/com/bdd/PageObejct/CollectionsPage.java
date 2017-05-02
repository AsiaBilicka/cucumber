package com.bdd.PageObejct;

import org.openqa.selenium.WebDriver;

public class CollectionsPage extends AbstractPage{
	public CollectionsPage(WebDriver driver){
		super(driver);
	}
	
	public String getUrl(){
		return driver.getCurrentUrl();
	}
	
	
}
