package orangehrmtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import apputils.Apputils;
import orangehrm.libraries.loginPage;

public class adminlogin extends Apputils {

	
	@Parameters({"adminuid","adminpwd"})
	@Test
	public void loginasadmin(String uid,String pwd)  {
		loginPage lp = new loginPage();
		
		lp.login(uid, pwd);
		boolean res =lp.Isadminmoduledisplayed();
	Assert.assertTrue(res);
	
		lp.logout();
		
		
		
	}
	
	
	
}
