package com.TestTest.AI;

import com.TravelTest.BrowserOption.BrowserOption;

public class ReuseRepoCodeWithAI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BrowserOption bo = new BrowserOption();
		LoginRepo loginRepo = new LoginRepo(bo.launchBrowser("chrome"));
		bo.navigateToProvideURL("https://travel-test-bug.vercel.app/login");
		
		loginRepo.login("hemant@gmail.com","Hemant@123",true);
	
		
		bo.quit();

	}

}
