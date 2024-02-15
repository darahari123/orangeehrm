package orangehrm.libraries;

import org.openqa.selenium.By;
import apputils.Apputils;

public class loginPage extends Apputils {
	
	
	public void login(String url,String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(url);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	
	}
	
  public boolean Isadminmoduledisplayed() {
	  if(driver.findElement(By.linkText("Admin")).isDisplayed()){
		  return true ;
	  }
	  return false;
	
	  }
  
  public void logout() {
	  driver.findElement(By.partialLinkText("Welcome")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
  public boolean errmsg(){
	  
	 String err =driver.findElement(By.id("spanMessage")).getText();
	 if(err.toLowerCase().contains("invalid")) {
		 return true;
	 }
	 else
	 {
	 return false;
	 }
  }
  public void empmoduledisplayed() {
	 try {
	driver.findElement(By.linkText("Admin")).isDisplayed();{
		 System.out.println("Admin module is showing");}
	 }
		 catch(Exception e) {
			 
			 System.out.println("emp module is  displaying");
		 
	 }
  }
  
  
  }
	

	

