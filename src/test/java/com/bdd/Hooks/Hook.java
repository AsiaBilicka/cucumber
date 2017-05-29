package com.bdd.Hooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bdd.PageObejcts.ProfilePage;
import com.bdd.Providers.ProfilePageProvider;

import cucumber.api.java.After;

public class Hook {
	
	@After("@userProfileDataCleanUp")
	public void userProfileDataTearDonw(){
		ProfilePage profilePage = ProfilePageProvider.getInstance();
		List<List<String>> defaultData = new ArrayList<List<String>>(); 
		defaultData.add(Arrays.asList("Field", "Value"));
		defaultData.add(Arrays.asList("email", "email@to.me"));
		defaultData.add(Arrays.asList("firstname", "name"));
		defaultData.add(Arrays.asList("lastname", "name"));
		defaultData.add(Arrays.asList("company", ""));
		defaultData.add(Arrays.asList("title", ""));
		defaultData.add(Arrays.asList("timezone", "Select your timezone"));
		profilePage.updateData(defaultData);
		profilePage.saveProfile();
		
	}

}
