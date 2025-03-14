package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	
	 WebDriver driver;
     
     public Dashboard(WebDriver driver) 
     {
         this.driver = driver;
         PageFactory.initElements(driver, this);
     }
		
	

		@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']")
		WebElement admin;
		
		public WebElement admin()
		{
			return admin;
		}
		
}
