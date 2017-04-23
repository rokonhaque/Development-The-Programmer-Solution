package com.bit.bluefly.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public FirefoxDriver driver;
	@Before
	public void start()
	{
		driver = new FirefoxDriver();
	}
	@After
	public void end() throws Throwable
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
