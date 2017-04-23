package com.bit.onlineshoping.support;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public FirefoxDriver driver = new FirefoxDriver();
	
	@Before
	public void beforeTest()
	{
		driver.get("http://www.facebook.com");
	}
	
	@After
	public void afterTest() throws Throwable
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	public void type(By moga, String moga2)
	{
		driver.findElement(moga).sendKeys(moga2);
	}
	
	public void click(By moga3)
	{
		driver.findElement(moga3).click();
	}
	
	public void verifyTextPresent(String moga4)
	{
		String mogaSource = driver.getPageSource();
		if(mogaSource.contains(moga4))
		{
			System.out.println("Text found");
		}
		else
		{
			System.out.println("Text not found");
		}
	}
	

}
