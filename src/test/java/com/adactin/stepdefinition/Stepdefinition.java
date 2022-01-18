package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.runner.TestRunner;
import com.pom.manager.PageObjectManger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class Stepdefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	//LoginPage lp = new LoginPage(driver);
	
	PageObjectManger pom = new PageObjectManger(driver);

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
		//File_Reader_Manager.getInstance().getInstanceCR().getUrl();

	}
	@When("^User enters the valid \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String arg1) throws Throwable {
	  valueToElement(pom.getLp().getUserName(), "Pavikumaresh");
	}

	@When("^User enters the valid \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_in_the_password_field(String arg1) throws Throwable {
	    valueToElement(pom.getLp().getPassWord(), "Pavikums@24");
	}
	
	
	  
	  @When("^User clicks on the login button$") public void
	  user_clicks_on_the_login_button() {
		  clickOnElement(pom.getLp().getLogin());
	  
	  
	  }
	  
	  @Then("^user verify the homepage navigates to search hotel$") public void
	  user_verify_the_homepage_navigates_to_search_hotel() {
		  
	  	  
	  }
	  
	  
	  
	 }
