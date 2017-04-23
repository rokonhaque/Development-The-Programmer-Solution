package com.bit.test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.bit.support.BrowserDriver;


public class BaseTest 
{
	BrowserDriver driver = new BrowserDriver();
	
	@Before
	public void start()
	{
		driver.startBrowser();
		
	}
	@After
	public void closeBrowser()
	{
	 driver.close();
		
	}
}
