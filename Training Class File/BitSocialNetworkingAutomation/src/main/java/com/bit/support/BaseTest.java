package com.bit.support;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public FirefoxDriver driver = new FirefoxDriver();
	
	@Before
	public void start()
	{
		System.out.println("Step - 1 : Opened Firefox browser");
		driver.get("http://www.facebook.com");
		System.out.println("Step - 2 : Go to facebook.com site");
	}
	
	@After
	public void end() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Test Ended");
	}
	
	public void type(By shala, String x)
	{
		driver.findElement(shala).sendKeys(x);
	}
	
	
}
