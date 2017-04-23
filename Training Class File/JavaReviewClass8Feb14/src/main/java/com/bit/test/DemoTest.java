package com.bit.test;

import org.junit.Test;

import com.bit.drivers.AbstractTraining;
import com.bit.drivers.ChromeDriver;
import com.bit.drivers.FirefoxDriver;
import com.bit.drivers.MogaDriver;
import com.bit.interfacetraining.WebDriver;

public class DemoTest extends AbstractTraining
{
	public void method123()
	 {
		 
	 }
	
	@Test
	public void test5()
	{
		System.out.println("DemoTest5");
		WebDriver x = new MogaDriver();
		WebDriver driver = new FirefoxDriver();
		WebDriver driver2 = new ChromeDriver();
	
		
		//AbstractTraining t = new AbstractTraining(); Abstract class can't be created as object
		
		m490();	
		
	}
	
	String name2 = "ridwan";
	
	public DemoTest()
	{
		super();
		System.out.println(name2);
	}
	
	

}
