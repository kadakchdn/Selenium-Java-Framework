package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

        WebDriver driver;
        
        public LoginPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
		
	

		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		
		
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		

		@FindBy(xpath="//button[normalize-space()='Login']")
		WebElement loginbutton;
		
		
		
		
		public WebElement username()
		{
			return username;
		}
		
		public WebElement password()
		{
			return password;
		}
		
		public WebElement login()
		{
			return loginbutton;
		}
		
		
}
