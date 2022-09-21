package stepdefinition;

import org.junit.Assert;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesObjects.PortalPage;

public class PortalPageSteps 
{
	
	private PortalPage portalpage;
	

@Given("The user is on Ds Algo portal link")
public void the_user_is_on_ds_algo_portal_link() 
{
	portalpage=new PortalPage(DriverFactory.getDriver());
   
}

@When("The user hits the URL {string}")
public void the_user_hits_the_url(String URL)
{
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");
   
}

@Then("User lands ds algo portal page seeing banner {string}")
public void user_lands_ds_algo_portal_page_seeing_banner(String expectedcontent) 
{
	String actualbanner=portalpage.bannerContent();
	System.out.println("banner content in portalpage is:"+actualbanner);
	Assert.assertTrue(actualbanner.contains(expectedcontent));	
   
}

@Then("User clicks on Get Started button")
public void user_clicks_on_get_started_button()
{
	portalpage.clickGetStarted();
   
}

@Then("User navigated to home page")
public void user_navigated_to_home_page() 
{
	System.out.println("URL of current page is:"+DriverFactory.getDriver().getCurrentUrl());
	Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),"https://dsportalapp.herokuapp.com/home");
	
   
}

}
