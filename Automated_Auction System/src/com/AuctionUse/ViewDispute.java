package com.AuctionUse;

import com.AuctionDao.AdminImplemetation;
import com.AuctionDao.AdminInterface;

public class ViewDispute {
   
	public static void viewDisputeDetails() {
		
		
		
		AdminInterface ad = new AdminImplemetation();
		ad.Dispute();
		
	}
	
		
	 	
	
}
