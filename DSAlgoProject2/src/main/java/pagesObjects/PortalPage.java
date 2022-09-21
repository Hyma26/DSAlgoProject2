package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage 
{
	public WebDriver driver;
	
	//By locators
	@FindBy(xpath="//button[@class='btn']")
	WebElement GetStarted_button;
	
	@FindBy(xpath="/html/body/div[1]/div/div/h1")
	WebElement banner;
	

	//constructor
	public PortalPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public String bannerContent() 
	{
		return banner.getText();
	}
	public PortalPage clickGetStarted() 
	{
		GetStarted_button.click();
		return new PortalPage(driver);
	}
	
}
