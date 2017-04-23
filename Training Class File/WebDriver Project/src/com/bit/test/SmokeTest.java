package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest extends BaseTest
{
	@Test
	public void login()
	{
		browse();
		findObject(By.id("email")).sendKeys("asad@gmail.com");
		
	}
	
	

}
