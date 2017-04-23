package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;

import com.bit.page.HomePage;
import com.bit.page.LoginPage;
import com.bit.page.PurchasePage;

public class SmokeTest
{
	LoginPage lp = new LoginPage();
	HomePage homePage;
	PurchasePage purchasePage;
	
	@Test
	public void login()
	{
		homePage	 = lp.login();
		homePage.clickHtml();
		purchasePage = homePage.clickPhp();
		homePage = purchasePage.back();	
	}
	
	@Test
	public void signUp()
	{
		login();
		
	}
	

}
