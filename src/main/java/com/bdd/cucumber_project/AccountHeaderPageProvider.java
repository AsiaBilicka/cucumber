package com.bdd.cucumber_project;

import com.bdd.PageObejct.AccountHeaderPage;

public class AccountHeaderPageProvider {

	private static AccountHeaderPage accountHeaderPage;

	public static AccountHeaderPage getInstance() {
		if (accountHeaderPage == null) {
			accountHeaderPage = new AccountHeaderPage(DriverProvider.getInstance());
		}
		return accountHeaderPage;
	}

	public static void removeInstance() {
		accountHeaderPage = null;
	}
}
