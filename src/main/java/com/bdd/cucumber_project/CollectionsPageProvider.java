package com.bdd.cucumber_project;

import com.bdd.PageObejct.CollectionsPage;

public class CollectionsPageProvider {

	private static CollectionsPage collectionsPage;

	public static CollectionsPage getInstance() {
		if (collectionsPage == null) {
			collectionsPage = new CollectionsPage(DriverProvider.getInstance());
		}
		return collectionsPage;
	}

	public static void removeInstance() {
		collectionsPage = null;
	}
}
