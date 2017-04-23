package com.Bit.Bluefly;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public FirefoxDriver driver = new FirefoxDriver();

	@Before
	public void start(){
		driver.get("http://www.bluefly.com");
	}
	
	@After
	public void end(){
		driver.quit();
	}
	
}
