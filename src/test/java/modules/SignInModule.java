package modules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.DataHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
public class SignInModule {
	
	

	
    public static void Execute(WebDriver driver,Properties OR,List<HashMap<String,String>> map) throws Exception{
        driver.findElement(By.linkText(OR.getProperty("signin_text"))).click();
        driver.findElement(By.id(OR.getProperty("username_id"))).sendKeys(map.get(0).get("username"));   
        driver.findElement(By.id(OR.getProperty("password_id"))).sendKeys(map.get(0).get("password"));

        driver.findElement(By.id(OR.getProperty("submit_login_id"))).click();
    }
}