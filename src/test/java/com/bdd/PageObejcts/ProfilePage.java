package com.bdd.PageObejcts;

import java.util.List;

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

	public void updateData(List<List<String>> data) {
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_first_name")).clear();
		driver.findElement(By.id("user_last_name")).clear();
		driver.findElement(By.id("user_profile_attributes_company")).clear();
		driver.findElement(By.id("user_profile_attributes_headline")).clear();
		driver.findElement(By.id("user_email")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("user_first_name")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("user_last_name")).sendKeys(data.get(3).get(1));
		driver.findElement(By.id("user_profile_attributes_company")).sendKeys(data.get(4).get(1));
		driver.findElement(By.id("user_profile_attributes_headline")).sendKeys(data.get(5).get(1));
		driver.findElement(By.id("user_profile_attributes_timezone")).sendKeys(data.get(6).get(1));
	}



}
