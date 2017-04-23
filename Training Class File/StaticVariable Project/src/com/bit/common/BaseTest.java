package com.bit.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	
    public FirefoxDriver x = new FirefoxDriver();

	
	@Before
	public void start()
	{
		x.get("http://www.facebook.com");
	}
	
	@After
	public void end() throws Exception
	{
		Thread.sleep(3000);
		x.quit();
	}

}
