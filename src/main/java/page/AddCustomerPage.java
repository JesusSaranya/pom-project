package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddCustomerPage extends BasePage {

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver)
	{
		this.driver = driver;
	}
  
	//WEBELEMENTS LIST
	@FindBy(how = How.XPATH , using = "//input[@id='account']")WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH,  using = "//select[@id='cid']")WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH , using = "//input[@id='address']")WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH , using = "//input[@id='city']")WebElement CITY_ELEMENT;
	
	
	// CORRESPONDING METHOD
	public void insertFullName(String FullName)
	{
		String insertedName = FullName + generateRandomNum(999); 
		FULLNAME_ELEMENT.sendKeys(insertedName);
	}
	
	public void selectCompanyDropDown(String Company)
	{
	selectFromDropDown(COMPANY_DROPDOWN_ELEMENT , Company);
	}

	public void insertEmail(String email)
	{
		String insertedEmail = generateRandomNum(9999) + email;
		EMAIL_ELEMENT.sendKeys(insertedEmail);
	}
	
	public void insertPhone(String phone)
	{
	PHONE_ELEMENT.sendKeys(phone + generateRandomNum(9999));	
	}
	
	public void insertaddress(String address)
	{
		ADDRESS_ELEMENT.sendKeys(address);
	}
	
	public void insertcity(String city)
	{
		CITY_ELEMENT.sendKeys(city);
	}
	
	
	
	
}
