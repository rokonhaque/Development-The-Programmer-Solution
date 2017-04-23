package com.bit.page;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class EventListPage 
{
	FirefoxDriver driver = new FirefoxDriver(); // This opens a blank firefox browser
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I am called after class");
	}
	
	@BeforeTest
	public void before()
	{
		driver.get("http://www.crowdsurge.com/store?storeid=1219");
	}
	
	@AfterTest
	public void stop()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void gotoallmethod()
	{
		System.out.println("i went to all method");
	}
	
	
	@Test
	public void buyTicket()
	{
		System.out.println("now in buy ticket");
		driver.findElement(By.xpath("//a[@class='action_button']//div[contains(text(),'Buy')]")).click();
		
	}
	
	
	@Test
	public void verifyObject()
	{
		System.out.println("Now in verify");
		driver.findElement(By.xpath("//a[text()='All Dates']"));
		driver.findElement(By.xpath("//a[text()='Merchandise']"));
		driver.findElement(By.xpath("//a[text()='Checkout']"));
		
	}
	
	public void bimal()
	{
		System.out.println("This is Bimal");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am called before class");
	}
	
}
