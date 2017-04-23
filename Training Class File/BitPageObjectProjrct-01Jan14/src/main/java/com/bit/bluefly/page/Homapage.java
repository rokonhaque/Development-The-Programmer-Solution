package com.bit.bluefly.page;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Homapage 
{
	private FirefoxDriver driver;
	public Homapage(FirefoxDriver driver)
	{
		this.driver = driver; 
		driver.get("http://www.bluefly.com");
	}
	public void clickWomenLink()
	{
		driver.findElement(By.xpath("//a[text()='Women']")).click();
	}

}
