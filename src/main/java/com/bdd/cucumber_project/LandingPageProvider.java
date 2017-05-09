package com.bdd.cucumber_project;

import com.bdd.PageObejct.LandingPage;

public class LandingPageProvider {

	private static LandingPage landingPage;

	public static LandingPage getInstance() {
		if (landingPage == null) {
			landingPage = new LandingPage(DriverProvider.getInstance());
		}
		return landingPage;
	}

	public static void removeInstance() {
		landingPage = null;
	}
}
