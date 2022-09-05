 package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_tc_001 extends BaseClass {

	@Test
	public void verify_TestLogin_validCredential() {
		
		//WebElement
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
	    // using GENRIC Method to Handle the Exception by (in Library define all ready try and catch method
		// so handle Exception and execute all test cases Exception print on console
		
		//Library.custom_sendkys(login.getText_emailid(), "vijaymahale11@gmail.com");//hard core data provide
		
		Library.custom_sendkys(login.getText_emailid(), excel.getStringData("Sheet1", 0, 0),"Emailid");//Excel sheet 
		
		//login.getText_emailid().sendKeys("vijaymahale11@gmail.com");
		
		//Library.custom_sendkys(login.getText_password()," 1545565555");//hard core data provide
		
		 Library.custom_sendkys(login.getText_password(),excel.getStringData("sheet1", 0, 1),"Password");//EXcel sheet
		
		 //login.getText_password().sendKeys("1545565555");
		 
		
		
		//login.getButton_Login().click();
		
		
		//Library.custom_HandleDropdown( null, null);
		//Library.custom_HandelMouseOver_click(driver, null);
		
		//Expilcit wait --->apply individual elements/particular element
		
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(login.getButton_Login()));
		
		

		Library.custom_click(login.getButton_Login(),"login");
		
		Library.getExplicitwait(driver, 10,login.getText_emailid() );
		Library.getExplicitwait(driver, 5, login.getText_password());
		
		
		
		
		
	}
}
