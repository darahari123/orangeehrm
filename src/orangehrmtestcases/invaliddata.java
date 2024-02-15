package orangehrmtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import apputils.Apputils;
import orangehrm.libraries.loginPage;

public class invaliddata extends Apputils {
	@Parameters({"adminuid","adminpwd"})
	@Test
	public void invalid(String uid,String pwd) {
		
		loginPage lp1= new loginPage();
		lp1.login(uid, pwd);
		boolean res =lp1.errmsg();
		Assert.assertTrue(res);
		
		
		
	}
	
	

}
