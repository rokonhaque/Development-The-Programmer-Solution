package com.bit.bluefly.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewArrivalPage 
{
	private FirefoxDriver driver;
	
	public NewArrivalPage(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickLast7DaysLink()
	{
		driver.findElement(By.xpath("//div[@class='newArrivalsContentsContainer']/a[1]")).click();
	}
	
	public ProductDetailPage clickFirstProductImage()
	{
		driver.findElement(By.xpath("//div[@id='productsContainer']/div[1]//img")).click();
		return new ProductDetailPage(driver);
	}
	

}
