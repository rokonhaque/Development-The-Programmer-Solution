package com.bit.bluefly.page;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IndexPage 

	
{
	private FirefoxDriver driver;
	public IndexPage(FirefoxDriver driver)
	{
		this.driver = driver;
		driver.get("http://www.bluefly.com/");
	}
	
	public NewPage goNewPage()
	{
		//This is page element for NewPage
		driver.findElementByXPath("//li[@id='main-nav-new']/a").click();
		//driver.findElementById("main-nav-new").click();
		return new NewPage(driver);
	}
	
	

}
