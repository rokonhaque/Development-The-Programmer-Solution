package com.bit.base;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.common.Reusable;

public class Login 
{
	
	public static FirefoxDriver driver = new FirefoxDriver();
	
	Reusable ru = new Reusable(driver);
	
	public void LoginValid() throws Exception
	{
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("bittechcorp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bit123456");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("//input[@value='Log Out']")).click();
		//driver.quit();
	}
	
	public void LoginInvalid() throws Exception
	{
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("bittechcorp1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bit123456");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		ru.verifyTextPresent("Facebook Login");
		ru.verifyTextPresent("Incorrect Email");
		driver.quit();
	}
	
	
	
	
	

}
