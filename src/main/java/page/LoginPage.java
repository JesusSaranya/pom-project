package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	//WEBELEMNT
	@FindBy(how = How.XPATH ,using ="//input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH , using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH , using = "//button[@name='login']") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//CORRESPONDING METHODS
	
	public void insertUserName(String userName)
	{
		USERNAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassWord(String passWord)
	{
		PASSWORD_ELEMENT.sendKeys(passWord);
	}
	
	public void ClickSignInButton()
	{
		SIGNIN_BUTTON_ELEMENT.click();
	}

	
	
	
	
	
	
	
	
	
	
}
