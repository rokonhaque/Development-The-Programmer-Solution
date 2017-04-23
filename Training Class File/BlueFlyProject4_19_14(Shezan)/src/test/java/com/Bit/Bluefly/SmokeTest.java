package com.Bit.Bluefly;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest extends BaseTest{
	
	
	@Test
	public void test1(){
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Click the Men Page.. 
		driver.findElement(By.xpath("//li[@id='main-nav-men']/a")).click();
		
		//click the first product..
		driver.findElement(By.xpath("//div[@id='departmentCrossSellContainer']/div[2]/div[1]/a")).click();
		
		//Size Select.
		driver.findElement(By.xpath("//div[@class='pdpSizeListContainer']/span[3]")).click();
		
		//add to Bag...
		driver.findElement(By.xpath("//span[@class='pdpAddToBagBtn']")).click();
		System.out.println("add to bag");
		
		
		//shopping bag check out click
		driver.findElement(By.xpath("//div[@id='shopBag']/a")).click();
		System.out.println("shopping bag check out click");
		
		//check out 2
		driver.findElement(By.xpath("//input[@id='cartCheckOutButton']")).click();
		System.out.println("check out 2");
		
		
		
		
		//Sign In as a guest.
		driver.findElement(By.xpath("//div[@class='loginGuestUserFormSubmitContainer']/input")).click();
		
		//Create an account
		//First Name
		driver.findElement(By.xpath("//input[@id='newShippingAddressFirstNameInput']")).sendKeys("Shezan");
		
		//Last Name
		driver.findElement(By.xpath("//input[@name='newShippingAddressLastNameInput']")).sendKeys("Tamzid");
		
		//Address 1
		driver.findElement(By.xpath("//input[@id='newShippingAddressAddyOneInput']")).sendKeys("12-13 Kissena ");
		
		//Address 2
		driver.findElement(By.xpath("//input[@id='newShippingAddressAddyTwoInput']")).sendKeys("23-34 main street");
		
		//City 
		driver.findElement(By.xpath("//input[@id='newShippingAddressCityInput']")).sendKeys("Flushing");
		
		//country
		driver.findElement(By.xpath("//select[@id='newShippingAddressCountryInput']//option[2]")).click();
		
		//state
		driver.findElement(By.xpath("//*[@id='newShippingAddressStateInputIntl']")).sendKeys("New York");
		
		//Zipcode
		driver.findElement(By.xpath("//*[@id='newShippingAddressZipInputIntl']")).sendKeys("11355");
		
		//phone
		driver.findElement(By.xpath("//*[@id='newShippingAddressPhoneInputIntl']")).sendKeys("123456677");
		
		//Email
		driver.findElement(By.xpath("//input[@id='newShippingAddressEmailInput']")).sendKeys("shezan.tamzid@yahoo.com");
		
		//Confirm - email
		driver.findElement(By.xpath("//input[@id='newShippingAddressEmailConfirmInput']")).sendKeys("shezan.tamzid@yahoo.com");
		
		//Create button (click)
		driver.findElement(By.xpath("//input[@class='newShippingAddressSubmitBtn']")).click();
		
		
		
	
	}
	
	

}
