package com.bit.note;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.common.BaseTest;

public class SmokeTest extends BaseTest
{
	
	
	@Test
	public void testLogin()
	{
		x.findElement(By.id("u_0_0")).sendKeys("Asad");
		
	}
	
	@Test
	public void testSignup()
	{
		x.findElement(By.id("u_0_1")).sendKeys("Zaman");
		
	}
	

}
