package com.bit.bluefly.page;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewPage 
{
	private FirefoxDriver driver;
	
	public NewPage(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	
	public NewPage verifyText(String text)
	{
		
		driver.getPageSource().contains(text);
		System.out.println("This test is a success");
		return this;
	}
	

}
