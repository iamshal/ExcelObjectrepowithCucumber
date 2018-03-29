package step_definitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import helpers.DataHelper;
import helpers.ObjectRepository;

import modules.ContactusModule;

import modules.SignInModule;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class KeywordDrivenFramework {
  
  public WebDriver driver;
  public List<HashMap<String,String>> datamap;
  
 
   public Properties OR;
  
  public KeywordDrivenFramework() throws IOException {
    
	driver = Hooks.driver;
     
	OR = ObjectRepository.ObjectRepo(System.getProperty("user.dir")+"//src//test//resources//OR.properties");
	datamap = DataHelper.data();
 }
 
  @When("^I open automationpractice website$")
  public void i_open_automationpractice_website() throws Throwable {

        driver.get("http://automationpractice.com");
  
  }
  
   @When("^I sign in$")
   public void i_sign_in() throws Throwable {
   SignInModule.Execute(driver,OR,datamap);
   
 }
   
   
  
  
  

  @Then("^I sign out$")
  public void i_sign_out() throws Throwable {
      
  }

  @Then("^I perform contact us actions$")
  public void i_perform_contact_us_actions() throws Throwable {
	  ContactusModule.Execute(driver,OR,datamap);

  }
      
  }

 
  
  
  
  
  
  
  
  
  
  
