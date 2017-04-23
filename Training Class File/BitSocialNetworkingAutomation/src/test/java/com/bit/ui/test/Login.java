package com.bit.ui.test;

import org.junit.Test;
import org.openqa.selenium.By;

import com.bit.support.BaseTest;

public class Login extends BaseTest
{
	@Test
	public void valid_login()
	{
		System.out.println("Test Started - 'valid_login'");
		//driver.findElement(By.id("email")).sendKeys("bittechcorp@gmail.com");
		type(By.name("email"),"bittechcorp@gmail.com");
		System.out.println("Step - 3 : Entered email into email textbox");
		//driver.findElement(By.id("pass")).sendKeys("Bit123456");
		type(By.id("pass"),"Bit123456");
		System.out.println("Step - 4 : Entered password into password textbox");
		
	}

}
