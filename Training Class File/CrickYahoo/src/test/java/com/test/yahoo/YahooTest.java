package com.test.yahoo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//package list.count.item;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.bcel.generic.Select;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest 
{

	//	@Test
		public void printCellData()
		{
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://cricket.yahoo.com/");
//			driver.manage().window().maximize();
//			Try below code, this will print all cells data,

			// Grab the table 
			WebElement table = driver.findElement(By.id("mediateamranking")); 

			// Now get all the TR elements from the table 
			List<WebElement> allRows = table.findElements(By.tagName("tr")); 
		//	System.out.println("allRows = "+allRows.size());

			// And iterate over them, getting the cells 
			for (WebElement row : allRows) { 
			    List<WebElement> cells = row.findElements(By.tagName("td")); 

			for (WebElement cell : cells) { 
			    System.out.println(cell.getText());
			}
			}
		}
		//@Test
		public void tableHandle() throws InterruptedException
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://cricket.yahoo.com/");
			driver.manage().window().maximize();
		     // Now get all the TR elements from the table
			  WebElement table=driver.findElement(By.id("mediateamranking"));
			// Get the table name
//			  WebElement table = driver.findElement(By.className("compact"));

			          // Get all the Table headers and look for one the element called quantity.
			          List<WebElement> allHeaders = table.findElements(By.tagName("h2"));
			          System.out.println("This is the total numbers of headers " + allHeaders.size());
			          int quantityHead = 0;
//			          http://stackoverflow.com/questions/19313385/selenium-webdriver-help-getting-specific-row-data-from-a-table
			          // Get the column where the quantity is listed
			          for(WebElement header : allHeaders)
			          {
			              quantityHead++;
			              if(header.getText().equalsIgnoreCase("Team Rankings"))
			              {
			                  System.out.println(header.getText());
			                  System.out.println(quantityHead + " is the column number for the quantity");
			              }
			          }
	        List<WebElement> allRows = table.findElements(By.tagName("tr"));
	        System.out.println("This is how many allRows: " + allRows.size());
			   // This is how many items are in the order item table. number of rows - 1 coz top row is the headings
	        int z = allRows.size() - 1;
	        System.out.println("This is how many items are in the table : " + z );

	        // Work out the cells we need to get by
	        //  iterate over all the td
	        for (WebElement row : allRows) {

	            // now we have all the td
	            List<WebElement> cells = row.findElements(By.tagName("td"));

	            for (WebElement cell : cells) {

	             for(int x=0; x <= allHeaders.size(); x++)
	             {
	                 int y = x;

	                 // if y = the value where the qty header is then output the text of that cell
	                 if(y == quantityHead )
	                 {
	                     System.out.println();
	                     System.out.println("The quanity is: " + cell.getText());
	                 }
	             }
	         }
	        }
			Thread.sleep(3000);
			driver.quit();
			
		}
		@Test
		public void dropDownListCount() throws IOException
		{
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.mlcalc.com/");
			driver.manage().window().maximize();
			
			  WebElement from1=driver.findElement(By.name("sm"));
	          File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         FileUtils.copyFile(src2,new File("c:\\screenshots\\"+Math.random()+"sc2.jpeg"));
		        // Get the list from the drop down list Selenium WebDriver
		        List<WebElement> list1=from1.findElements(By.tagName("option"));
		        System.out.println("Total months = "+list1.size());
		        for(WebElement i:list1)
		        {
		            System.out.println(i.getText());
		          
		        } 

			driver.quit();
			
		}
		
}
