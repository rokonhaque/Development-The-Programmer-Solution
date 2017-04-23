package com.bit.test;

import org.junit.After;
import org.junit.Before;

import com.bit.support.BrowserDriver;

public class BaseTest extends BrowserDriver
{
	@Before
	public void start()
	{
		openBrowser();
	}
	
	@After
	public void end()
	{
		closeBrowser();
	}

}
