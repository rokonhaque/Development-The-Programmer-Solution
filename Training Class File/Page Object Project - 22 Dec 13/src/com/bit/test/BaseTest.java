package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	protected FirefoxDriver driver = new FirefoxDriver();
	
	@Before
	public void start()
	{
		driver.get("http://www.bittechusa.com");
	}
	
	@After
	public void end()
	{
		driver.quit();
	}

}
