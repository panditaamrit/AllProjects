package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
public class stepDifinition {
	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing() throws Throwable
	{
		System.out.println("User is on NetBanking landing page");		
		
	}
	@When("^User login into application with username and password$")
	public void User_login_into_application_with_username_and_password() throws Throwable
	{
		System.out.println("User login into application with username and password");		
		
	}
	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable
	{
		System.out.println("Home page is populated");	
		
	}
	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable
	{
		System.out.println("Cards are displayed");	
		
	}
}
