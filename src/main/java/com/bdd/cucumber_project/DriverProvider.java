package com.bdd.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

	private static WebDriver driver;

	public static WebDriver getInstance() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static void removeInstance() {
		driver.close();
		driver = null;
	}
}
