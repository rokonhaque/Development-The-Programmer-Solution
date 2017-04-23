package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver 
{
	private WebDriver x ;
	
	public void openBrowser()
	{
		x = new FirefoxDriver();
	}
	
	public void closeBrowser()
	{
		x.quit();
	}
	
	public void browse()
	{
		x.get("http://www.facebook.com");
	}
	
	public WebElement findObject(By by)
	{
		return x.findElement(by);
	}

}
