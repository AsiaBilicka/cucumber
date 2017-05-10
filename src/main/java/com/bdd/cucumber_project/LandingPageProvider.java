package com.bdd.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bdd.PageObejct.LandingPage;

public class LandingPageProvider {

	private final static int MAX_TIMEOUT_IN_SECONDS = 60;

	private static LandingPage landingPage;

	public static LandingPage getInstance() {
		if (landingPage == null) {
			WebDriver driver = DriverProvider.getInstance();
			landingPage = new LandingPage(driver, new WebDriverWait(driver, MAX_TIMEOUT_IN_SECONDS));
		}
		return landingPage;
	}

	public static void removeInstance() {
		landingPage = null;
	}
}
