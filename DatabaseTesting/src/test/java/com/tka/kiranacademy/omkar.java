package com.tka.kiranacademy;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.kiranacademy.constant.AssertData;
import com.kiranacademy.constant.Locators;
import com.kiranacademy.constant.Testdata;
import com.kiranacademy.testConfig.Configuration;

public class omkar extends Configuration {
	
	
	
	  @Test
		public void testLogin1 () {
	
			driver.findElement(By.id(Locators.BY_ID_USERNAME)).sendKeys(Testdata.ADMIN_USERNAME);
			driver.findElement(By.id(Locators.BY_ID_PASSORD)).sendKeys(Testdata.ADMIN_PASSWORD);
			driver.findElement(By.id(Locators.BY_ID_LOGIN_BTN)).click();
			String title=driver.getCurrentUrl();
			
			
			driver.quit();
			assertEquals(AssertData.HOME_PAGE_CURRENT_URL, title);
			
			
		}
		


}