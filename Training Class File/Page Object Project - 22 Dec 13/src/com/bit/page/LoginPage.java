package com.bit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bit.test.BaseTest;

public class LoginPage extends BaseTest
{
	WebElement lusername = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.id("password2"));
	
	
	
	
	HomePage hp = new HomePage();
	
	public HomePage login()
	{
		lusername.sendKeys("asad");
		password.sendKeys("123");
		driver.findElement(By.linkText("LOG IN")).click();
		return hp;
	}
	
	public void signUp()
	{
		lusername.sendKeys("asad");
		password.sendKeys("123");
		driver.findElement(By.linkText("LOG IN")).click();
		
	}
	public void signUp1()
	{
		lusername.sendKeys("asad");
		password.sendKeys("123");
		driver.findElement(By.linkText("LOG IN")).click();
		
	}
	
	public void signU1p()
	{
		lusername.sendKeys("asad");
		password.sendKeys("123");
		driver.findElement(By.linkText("LOG IN")).click();
		
	}
	
	public void si2gnUp()
	{
		lusername.sendKeys("asad");
		driver.findElement(By.id("login-password")).sendKeys("123");
		driver.findElement(By.linkText("LOG IN")).click();
		
	}

}
