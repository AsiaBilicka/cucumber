package com.bdd.Providers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bdd.PageObejcts.AccountHeaderPage;

public class AccountHeaderPageProvider {

	private final static int MAX_TIMEOUT_IN_SECONDS = 60;

	private static AccountHeaderPage accountHeaderPage;

	public static AccountHeaderPage getInstance() {
		if (accountHeaderPage == null) {
			WebDriver driver = DriverProvider.getInstance();
			accountHeaderPage = new AccountHeaderPage(driver, new WebDriverWait(driver, MAX_TIMEOUT_IN_SECONDS));
		}
		return accountHeaderPage;
	}

	public static void removeInstance() {
		accountHeaderPage = null;
	}
}
