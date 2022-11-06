package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.Browsefactory;

public class AddCustomerTest {

	
	 WebDriver driver;
		
		//LOGIN DATA
		String userName = "demo@techfios.com";
		String passWord = "abc123";
		String fullname = "Java Selenium";
		String company = "Amazon";
		String email ="abc@techfios.com";
		String phoneNum ="123456";
		String address = "340 mother terasa road";
		String city ="New York";
		
		
		@Test
		public void validUserShouldBeabletoLogin()
		{
			driver = Browsefactory.init();
			
			LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		    loginpage.insertUserName(userName);
		    loginpage.insertPassWord(passWord);
		    loginpage.ClickSignInButton();
		    
		    DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		    dashboard.validateDashBoardPage();
		    dashboard.clickCustomermenuButton();
		    dashboard.clickAddCustomerButton();
		    
		    AddCustomerPage addcus = PageFactory.initElements(driver, AddCustomerPage.class);
		    addcus.insertFullName(fullname);
		    addcus.selectCompanyDropDown(company);
		    addcus.insertEmail(email);
		    addcus.insertPhone(phoneNum);
		    addcus.insertaddress(address);
		    addcus.insertcity(city);
		    
		   // Browsefactory.tearDown();
		}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
