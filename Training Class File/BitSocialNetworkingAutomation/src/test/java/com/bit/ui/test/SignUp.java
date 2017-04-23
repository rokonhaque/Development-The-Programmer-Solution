package com.bit.ui.test;

import org.junit.Test;
import org.openqa.selenium.By;

import com.bit.support.BaseTest;

public class SignUp extends BaseTest
{
	@Test
	public void sign_up()
	{
		System.out.println("Test Started - 'sign_up'");
		driver.findElement(By.id("u_0_0")).sendKeys("Asad");
		System.out.println("Step - 3 : Entered First Name into First Name textbox");
		
		
	}

}
