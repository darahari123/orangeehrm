package orangehrm.libraries;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import apputils.Apputils;

public class Adminutils extends Apputils {
	 loginPage lp;
	 String uid ="Admin";
	 String pwd = "Qedge123!@#";
	
	  @BeforeTest
	public void login() {
		   lp = new loginPage();
		  lp.login(uid, pwd);
		  
	
		}
	      @AfterTest
	      public void logout() {
	    	  lp.logout();
	}

}
