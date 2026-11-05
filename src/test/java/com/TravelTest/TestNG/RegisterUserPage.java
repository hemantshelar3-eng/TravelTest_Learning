package com.TravelTest.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TravelTest.Repo.RegRepo;
import com.TravelTest.Repo.RegisterRepo;

public class RegisterUserPage extends LaunchBrowserAndQuit{
	@Test (priority = 1)
    public void VerifyRegisterLink() throws Exception {
    	 rg = new RegisterRepo(w);
        rg.registerLink();

        Thread.sleep(2000);

        try {
            Assert.assertEquals(
                w.getCurrentUrl(),
                "https://travel-test-bug.vercel.app/register"
            );
        } finally {
        }
    }
	
	@Test (priority = 2)  //register user with corrent data
    public void UserRegistervalidData() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("AMit");
        Thread.sleep(2000);
        rg.email("demo123@gmail.com");
        Thread.sleep(2000);
        rg.phone("9876543210");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("Demo@1234");
        Thread.sleep(2000);
        rg.confPassword("Demo@1234");
        Thread.sleep(2000);
        rg.iagree();
        Thread.sleep(2000);
        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),
                "https://travel-test-bug.vercel.app/login"
            );
        } finally {
        }
    }
	 
	@Test (priority = 3)  //register user with Invalid data
    public void UserRegisterInvalidData() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("@@@");
        Thread.sleep(2000);
        rg.email("@@@");
        Thread.sleep(2000);
        rg.phone("hbnnkk2222");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("@@@");
        Thread.sleep(2000);
        rg.confPassword("@@@");
        Thread.sleep(2000);
        rg.iagree();
        Thread.sleep(2000);
        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }
    }
	
	@Test (priority = 4)  //register user with Invalid data
    public void UserRegisterInvalidEmail() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("Rahul");
        Thread.sleep(2000);
        rg.email("@@@@");
        Thread.sleep(2000);
        rg.phone("9876543210");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("@@@12");
        Thread.sleep(2000);
        rg.confPassword("@@@12");
        Thread.sleep(2000);
        rg.iagree();
        Thread.sleep(2000);
        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }
    }
	@Test (priority = 5)  //register user with Invalid data
    public void UserRegisterInvalidPhone() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("Rahul");
        Thread.sleep(2000);
        rg.email("dem@12");
        Thread.sleep(2000);
        rg.phone("qwertyui@fkm");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("@@@12");
        Thread.sleep(2000);
        rg.confPassword("@@@12");
        Thread.sleep(2000);
        rg.iagree();
        Thread.sleep(2000);
        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }
    }
	
	@Test  (priority = 6) //register user with Invalid data
    public void UserRegisterUnmatchPassword() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("Rahul");
        Thread.sleep(2000);
        rg.email("demo123@gmail.com");
        Thread.sleep(2000);
        rg.phone("9876543210");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("Abc@123");
        Thread.sleep(2000);
        rg.confPassword("abfg@124");
        Thread.sleep(2000);
        rg.iagree();
        Thread.sleep(2000);
        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }
    }
	
	@Test (priority = 7)  //register user with Invalid data
    public void RegisterWithOutIagreeTerm() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("Rahul");
        Thread.sleep(2000);
        rg.email("demo123@gmail.com");
        Thread.sleep(2000);
        rg.phone("9876543210");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("Abc@123");
        Thread.sleep(2000);
        rg.confPassword("Abc@123");
        Thread.sleep(2000);

        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }
    }

	@Test  (priority = 8) //register user with Invalid data
    public void RegisterAlreadyRegisterUser() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("Rahul");
        Thread.sleep(2000);
        rg.email("softwaretestingai708@atomicmail.io");
        Thread.sleep(2000);
        rg.phone("9876543210");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("ITvedant@708");
        Thread.sleep(2000);
        rg.confPassword("ITvedant@708");
        Thread.sleep(2000);

        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }
    }
	
	@Test  (priority = 9) //register user with Invalid data
    public void FieldBlankRegister() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        
        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }
    }

	@Test  (priority = 10) //register user with Invalid data
    public void RegisterBlankPhone() throws Exception {
    	 rg = new RegisterRepo(w);
    	 rg.registerLink();
    	  Thread.sleep(2000);
        rg.fullname("Rahul");
        Thread.sleep(2000);
        rg.email("demo@123.in");
        Thread.sleep(2000);
        rg.phone("");
        Thread.sleep(2000);
        rg.GenderMale();
        Thread.sleep(2000);
        rg.passwrod("ITvedant@708");
        Thread.sleep(2000);
        rg.confPassword("ITvedant@708");
        Thread.sleep(2000);

        rg.RegisterButton();
        Thread.sleep(2000);
        try {
            Assert.assertEquals(
                w.getCurrentUrl(),"https://travel-test-bug.vercel.app/register");
        } finally {
        }	
}
	
	
	
}

