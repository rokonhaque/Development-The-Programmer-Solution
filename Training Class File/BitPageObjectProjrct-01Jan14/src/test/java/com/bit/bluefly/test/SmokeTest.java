package com.bit.bluefly.test;

import org.junit.Test;

import com.bit.bluefly.page.Homapage;

public class SmokeTest extends BaseTest
{
	@Test
	public void  purchase()
	{
		Homapage hpage = new Homapage(driver);
		hpage.clickWomenLink();
	}
	
	@Test
	public void addToCart()
	{
		
	}

}
