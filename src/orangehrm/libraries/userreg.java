package orangehrm.libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import apputils.Apputils;

public class userreg extends Apputils {
	public boolean userregg(String role,String empname,String username,String pwordds) throws InterruptedException 
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.name("btnAdd")).click();
		Select rol = new Select(driver.findElement(By.id("systemUser_userType")));
		rol.selectByVisibleText(role);
		
		driver.findElement(By.xpath("//input[contains(@id,'empName')]")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(username);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwordds);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwordds);
		
		Thread.sleep(2000);
		driver.findElement(By.name("btnSave")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);
		driver.findElement(By.id("searchBtn")).click();
		boolean res=false;
		WebElement tab = driver.findElement(By.id("resultTable"));
		 List<WebElement> rows =  tab.findElements(By.tagName("tr"));
		 for(int i=1;i<rows.size();i++) {
			 List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			 if(cols.get(1).getText().equals(username)) {
				res = true;
				break;
			 }
			 }
		 
	     return res;
	
}
}


