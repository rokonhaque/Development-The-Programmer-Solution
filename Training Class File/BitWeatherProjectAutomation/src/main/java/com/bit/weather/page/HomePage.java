package com.bit.weather.page;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver)
	{
		this.driver = driver;
		driver.get("http://www.yr.no");	
	}
	
	public SearchResultsPage search(String stext)
	{
		driver.findElement(By.name("sted")).sendKeys(stext);
		driver.findElement(By.id("queryknapp")).click();
		return new SearchResultsPage(driver);
	}

}
