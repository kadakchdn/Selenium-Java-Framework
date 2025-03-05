package testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.LoginPage;
import utilities.Utility;



public class LoginTest extends BaseClass
{
	public LoginTest()
	{
		super();
	}
	
	@Test //(priority=2)
	public void loginTest()
	{
		LoginPage page=new LoginPage(driver);
		page.username().sendKeys(prop.getProperty("USERNAME"));
		page.password().sendKeys(prop.getProperty("PASSWORD"));
		page.login().click();
	}

	/*
	@Test(priority=1 , dataProvider="aKSHAY")
	public void loginTestDDT(String username, String password)
	{
		LoginPage page=new LoginPage(driver);
		page.username().sendKeys(username);
		page.password().sendKeys(password);
	}
	
	@DataProvider(name="aKSHAY")
	public String[] [] suppyLoginData()
	{
		String  data [][]=Utility.printData("Login");
		
		return data;
	}
	*/
}
