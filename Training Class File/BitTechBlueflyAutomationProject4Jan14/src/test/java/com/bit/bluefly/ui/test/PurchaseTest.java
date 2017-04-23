package com.bit.bluefly.ui.test;

import org.junit.Test;

import com.bit.bluefly.ui.page.HomePage;
import com.bit.bluefly.ui.page.NewArrivalPage;
import com.bit.bluefly.ui.page.ProductDetailPage;



public class PurchaseTest extends BaseTest
{
	NewArrivalPage newArrivalPage;
	ProductDetailPage productDetailPage;
	
	@Test
	public void mensProductPurchase()
	{
		HomePage homePage = new HomePage(driver);
		newArrivalPage = homePage.clickNewArrivalLink();
		newArrivalPage.clickLast7DaysLink();
		productDetailPage = newArrivalPage.clickFirstProductImage();
		 
	}
	

}
