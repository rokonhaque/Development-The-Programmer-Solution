package com.abc.ui.test;

import org.junit.Test;
import org.openqa.selenium.By;

import com.bit.common.BaseTest;

public class MogaTest extends BaseTest
{
	@Test
	public void testLogin3()
	{
		x.findElement(By.id("u_0_0")).sendKeys("Asad");
		
	}
	
	@Test
	public void testSignup4()
	{
		x.findElement(By.id("u_0_1")).sendKeys("Zaman");
		
	}
	

}
