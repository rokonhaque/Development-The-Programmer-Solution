package com.bit.weather.page;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchResultsPage 
{
	private FirefoxDriver driver;
	
	public SearchResultsPage(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	
	public LocationPage clickFirstSearchLink()
	{
		driver.findElement(By.xpath("//a[text()='Stockholm']")).click();
		
		return new LocationPage(driver);
	}

}
