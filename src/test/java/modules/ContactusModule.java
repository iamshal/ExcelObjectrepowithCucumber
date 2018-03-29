package modules;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
public class ContactusModule {
 
   public static void Execute(WebDriver driver,Properties OR,List<HashMap<String,String>> map) throws Exception{
   
     driver.findElement(By.linkText(OR.getProperty("contact_us_text"))).click();
    
    new Select(driver.findElement(By.id(OR.getProperty("subject_heading_id")))).selectByVisibleText("Customer service");
  
      driver.findElement(By.id(OR.getProperty("email_id"))).sendKeys((String)map.get(0).get("email"));
      
  driver.findElement(By.id(OR.getProperty("order_reference_id"))).sendKeys(map.get(0).get("order_reference"));
  
      driver.findElement(By.id(OR.getProperty("message_id"))).sendKeys(map.get(0).get("message"));
   
     driver.findElement(By.id(OR.getProperty("submit_message_id"))).click();
 

   }
}