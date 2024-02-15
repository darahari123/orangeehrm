package orangehrm.libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import apputils.Apputils;

public class employeepage extends Apputils{
	public boolean employereg(String fname,String lname) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
	 WebElement emptab =	driver.findElement(By.id("resultTable"));
	List<WebElement> rows= emptab.findElements(By.tagName("tr"));
     boolean flag =false;
	for(int i=1;i<rows.size();i++) {
	List<WebElement> cols =	rows.get(i).findElements(By.tagName("td"));
	if(cols.get(1).getText().equals(empid)) {
		
		 flag=true;
		break;
	}	
	}
	return flag;
	}
	/*public boolean employereg(String fname,String mname,String lname) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("middleName")).sendKeys(mname);
		
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
	 WebElement emptab =	driver.findElement(By.id("resultTable"));
	List<WebElement> rows= emptab.findElements(By.tagName("tr"));
     boolean flag =false;
	for(int i=1;i<rows.size();i++) {
	List<WebElement> cols =	rows.get(i).findElements(By.tagName("td"));
	if(cols.get(1).getText().equals(empid)) {
		
		 flag=true;
		break;
	}	
	}
	return flag;
		
	}
		*/
		
	}
        

