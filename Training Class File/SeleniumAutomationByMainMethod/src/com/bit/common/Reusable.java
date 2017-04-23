package com.bit.common;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.base.Login;

public class Reusable
{
	FirefoxDriver driver;
	
	public Reusable(FirefoxDriver moga)
	{
		this.driver = moga;
	}
	
	public Reusable()
	{
		
	}
	
	public void verifyTextPresent(String expectedText)
	{
		String pageSource = driver.getPageSource();
		
		if(pageSource.contains(expectedText))
		{
			System.out.println("'"+expectedText + "'"+ " text found");
		}
		else
		{
			System.out.println("'"+expectedText + "'"+ " text not found");
		}
	}

}



