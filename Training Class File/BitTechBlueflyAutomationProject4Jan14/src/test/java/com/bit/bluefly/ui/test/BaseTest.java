package com.bit.bluefly.ui.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	FirefoxDriver driver;
	
	@Before
	public void start()
	{
		driver = new FirefoxDriver();
	}
	
	@After
	public void end() throws Exception
	{
		Thread.sleep(5000);
		driver.quit();	
	}

}
