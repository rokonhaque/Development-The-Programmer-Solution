package com.bit.onlineshopping.test;
import org.junit.Test;
import org.openqa.selenium.By;

import com.bit.onlineshoping.support.BaseTest;

public class SmokeTest extends BaseTest
{
	@Test
	public void logIn()
	{
		/*driver.findElement(By.id("email")).sendKeys("bittechcorp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bit123456");
		driver.findElement(By.id("loginbutton")).click();*/
		verifyTextPresent("Sign Up");
		type(By.id("email"),"bittechcorp@gmail.com");
		type(By.id("pass"),"Bit123456");
		click(By.id("loginbutton"));
		
	}
	

}
