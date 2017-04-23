package com.bit.page;

public class HomePage 
{
	PurchasePage pp = new PurchasePage();
	BalanceTransferPage bt = new BalanceTransferPage();
	
	public BalanceTransferPage clickHtml()
	{
		return bt;
	}
	
	public PurchasePage clickPhp()
	{
		return pp;
	}


}
