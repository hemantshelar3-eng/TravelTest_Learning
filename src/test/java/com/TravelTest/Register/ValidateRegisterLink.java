package com.TravelTest.Register;

import com.TravelTest.BrowserOption.BrowserOption;
import com.TravelTest.Repo.RegRepo;

public class ValidateRegisterLink {

	public static void main(String[] args) {
     BrowserOption b = new BrowserOption();
     RegRepo r = new RegRepo(b.launchBrowser("chrome"));
     b.navigateToProvideURL("https://travel-test-bug.vercel.app/");
     r.regLink();

	}
}
