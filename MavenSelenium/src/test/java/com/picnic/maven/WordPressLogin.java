package com.picnic.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import com.picnic.maven.LoginPage;
 
/**
* @author Mukesh_50
*
*/
public class WordPressLogin 
{
 
 
@Test
public void verifyValidLogin()
{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\steenac\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe"); 
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
LoginPage login=new LoginPage(driver);
login.typeUserName("Admin");
login.typePassword("admin123");
 
 
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}
