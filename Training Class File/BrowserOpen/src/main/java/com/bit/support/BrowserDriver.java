package com.bit.support;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;




public class BrowserDriver
{
	//public static final String B = "browser";
	
	private WebDriver driver;
	
	public void startBrowser()
	{
		
		String b=System.getProperty("Browser");
		
		if(b.equals("Firefox"))
			{
			driver = new FirefoxDriver();
			}
		else if(b.equals("Chrome"))
			{
			URL chromeDriverURL = BrowserDriver.class.getResource("/drivers/chromedriver.exe");
			File file = new File(chromeDriverURL.getFile()); 
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, file.getAbsolutePath());
			driver = new ChromeDriver();
			}
		else if(b.equals("IE"))
			{
			URL IEDriverURL = BrowserDriver.class.getResource("/drivers/IEDriverServer.exe");
			File file = new File(IEDriverURL.getFile()); 
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, file.getAbsolutePath());
			
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			driver = new InternetExplorerDriver(capabilities);
			}
		else
			{
			driver = new FirefoxDriver();
			}
			
	}
	public void close()
	{
		driver.quit();		
	}
	public WebDriver getDriver()
	{
		return driver;
	}
	
	

}
