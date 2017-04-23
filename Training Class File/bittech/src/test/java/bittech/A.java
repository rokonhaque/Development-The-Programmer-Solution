package bittech;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A 
{
	FirefoxDriver x;
	@Test 
	public void test1()
	{
		x = new FirefoxDriver();
		
	}
	
	@Test 
	public void test2() throws Exception
	{
		Thread.sleep(3000);
		x.quit();
	}

}
