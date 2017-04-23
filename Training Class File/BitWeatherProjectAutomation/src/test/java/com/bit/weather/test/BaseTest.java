package com.bit.weather.test;

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
	public void end()
	{
		driver.quit();
	}

}
