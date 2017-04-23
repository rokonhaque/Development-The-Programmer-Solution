package com.bit.bluefly.test;

import org.junit.Test;

import com.bit.bluefly.page.IndexPage;
import com.bit.bluefly.page.NewPage;

public class SmokeTest extends BaseTest
{
	IndexPage indexPage;
	NewPage newPage;
	
	
	@Test
	public void simpleTest()
	{
		indexPage = new IndexPage(driver);
		newPage = indexPage.goNewPage(); //Points to indexPages goNewPage
		
		newPage = newPage.verifyText("All Bluefly");
	}
	
	

}
