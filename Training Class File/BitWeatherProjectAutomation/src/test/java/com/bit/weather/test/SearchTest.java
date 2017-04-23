package com.bit.weather.test;

import org.junit.Test;

import com.bit.weather.page.HomePage;
import com.bit.weather.page.LocationPage;
import com.bit.weather.page.SearchResultsPage;

public class SearchTest extends BaseTest
{
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	LocationPage locationPage;
	
	@Test
	public void searchTest()
	{
		homePage = new HomePage(driver);
		searchResultsPage = homePage.search("Stockholm");
		locationPage = searchResultsPage.clickFirstSearchLink();
	}

}
