package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {

	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using = "//h2[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_HEADER_ELEMENT;
	
	@FindBy(how = How.XPATH , using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMER_ELEMENT;
	
	@FindBy(how = How.XPATH , using = "//a[contains(text(),'Add Customer')]")
	WebElement ADD_CUSTOMER_ELEMENT;
	
	
	
	//corresponding method
	public void validateDashBoardPage()
	{
     Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard" , "Dashboard page not found");
	}
	
	public void clickCustomermenuButton()
	{
		CUSTOMER_ELEMENT.click();
	}
	
	public void clickAddCustomerButton()
	{
		ADD_CUSTOMER_ELEMENT.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
