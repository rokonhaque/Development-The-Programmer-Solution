package com.bit.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReviewPage 
{
	FirefoxDriver browser = new FirefoxDriver();
	
	@Before
	public void start()
	{
		browser.get("http://www.crowdsurge.com/store?storeid=1219");
	}
	
	@After
	public void end()
	{
		browser.quit();
	}
	
	@Test
	public void verifyObject()
	{
		browser.findElement(By.xpath("//a[text()='All Dates']"));
	}
	
	@Test
	public void buyTicket()
	{
		browser.findElement(By.xpath("//a[@class='action_button']//div[contains(text(),'Buy')]")).click();
	}

}
