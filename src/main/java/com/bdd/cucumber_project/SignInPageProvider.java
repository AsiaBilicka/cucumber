package com.bdd.cucumber_project;

import com.bdd.PageObejct.SignInPage;

public class SignInPageProvider {

	private static SignInPage signInPage;

	public static SignInPage getInstance() {
		if (signInPage == null) {
			signInPage = new SignInPage(DriverProvider.getInstance());
		}
		return signInPage;
	}

	public static void removeInstance() {
		signInPage = null;
	}
}
