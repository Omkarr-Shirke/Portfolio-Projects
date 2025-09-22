package com.kiranacademy.testConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Configuration {
	
	
	public WebDriver driver= null;
	
	@BeforeMethod
    public  WebDriver getConfiguration () {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		return driver;

}
    @AfterMethod
    public void closeBrowser() {
    	
    	if (driver !=null) {
    		
    		driver.quit();
			
		}
    	
    }
    
}