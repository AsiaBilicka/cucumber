package com.bdd.Providers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bdd.PageObejcts.SignInPage;

public class SignInPageProvider {

	private final static int MAX_TIMEOUT_IN_SECONDS = 60;

	private static SignInPage signInPage;

	public static SignInPage getInstance() {
		if (signInPage == null) {
			WebDriver driver = DriverProvider.getInstance();
			signInPage = new SignInPage(driver, new WebDriverWait(driver, MAX_TIMEOUT_IN_SECONDS));
		}
		return signInPage;
	}

	public static void removeInstance() {
		signInPage = null;
	}
}
