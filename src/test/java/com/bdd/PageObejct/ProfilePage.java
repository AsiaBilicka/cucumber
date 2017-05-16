package com.bdd.PageObejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends AbstractPage{

	public ProfilePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void uploadImage(){
		driver.findElement(By.id("user_profile_attributes_avatar")).sendKeys("C:/Users/joanna.bilicka/workspace/cucumber_project/src/test/java/com/bdd/PageObejct/images/panda.jpg");

	}

	public String checkAvatar() {
		return driver.findElement(By.className("img-circle")).getAttribute("src");
	}

	public void saveProfile() {
		driver.findElement(By.name("commit")).click();
		
	}



}
