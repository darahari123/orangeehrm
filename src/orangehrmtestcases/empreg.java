package orangehrmtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.libraries.Adminutils;
import orangehrm.libraries.employeepage;

public class empreg extends Adminutils{
	
	
	@Parameters({"empname","username"})
	@Test
	public void empregg(String fname,String lname) {
		
		employeepage emp = new employeepage();
		boolean ress = emp.employereg(fname, lname);
		Assert.assertTrue(ress);
		
	}	
}