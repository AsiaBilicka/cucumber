package com.bdd.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bdd.PageObejct.ProfilePage;

public class ProfilePageProvider {

	private final static int MAX_TIMEOUT_IN_SECONDS = 60;

	private static ProfilePage profilePage;

	public static ProfilePage getInstance() {
		if (profilePage == null) {
			WebDriver driver = DriverProvider.getInstance();
			profilePage = new ProfilePage(driver, new WebDriverWait(driver, MAX_TIMEOUT_IN_SECONDS));
		}
		return profilePage;
	}

	public static void removeInstance() {
		profilePage = null;
	}
}
