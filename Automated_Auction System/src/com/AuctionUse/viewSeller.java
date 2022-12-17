package com.AuctionUse;

import com.AuctionDao.AdminImplemetation;
import com.AuctionDao.AdminInterface;

import Exception.SellerException;
import Main.AdminMain;

public class viewSeller {
	  
	public static void SellerDetails(){
		AdminInterface ad = new AdminImplemetation();
		ad.viewSellerlist();
	 
	}
}
