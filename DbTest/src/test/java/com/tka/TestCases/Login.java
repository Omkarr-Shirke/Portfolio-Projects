package com.tka.TestCases;

import org.testng.annotations.Test;


import com.tka.Base.Base;
import com.tka.TestData.TestData;
import com.tka.pages.LoginPage;
import com.tka.utility.ScreenshotUtil;

public class Login extends Base {
	
	@Test
	void m1() {
		
		LoginPage page= new LoginPage(driver);
		page.setUsername(TestData.USERNAME);
		
		page.setPassword(TestData.PASSWORD);
		
		page.clickLoginBTN();
		
		ScreenshotUtil.takeScreenshot(driver, "m1");
		

	}

}
