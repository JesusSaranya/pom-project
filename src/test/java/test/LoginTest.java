package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.Browsefactory;

public class LoginTest {

	WebDriver driver;
	
	//LOGIN DATA
	String userName = "demo@techfios.com";
	String passWord = "abc123";
	
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
	    
	    Browsefactory.tearDown();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
