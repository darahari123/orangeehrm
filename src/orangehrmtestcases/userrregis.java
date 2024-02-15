package orangehrmtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.libraries.Adminutils;
import orangehrm.libraries.loginPage;
import orangehrm.libraries.userreg;

public class userrregis extends Adminutils {
	
	
	
	@Parameters({"roll","empname","username","userpwd"})
	@Test
	public void reguser(String roll,String empname,String username, String userpwd) throws InterruptedException {
		
		
		
		userreg use = new userreg();
		boolean res = use.userregg(roll, empname, username, userpwd);
		Assert.assertTrue(res);
		
		
	}
 
}
