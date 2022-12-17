package com.AuctionUse;

 import com.AuctionDao.AdminImplemetation;
import com.AuctionDao.AdminInterface;

import Exception.BuyerException;

 

public class ViewBuyerList {
	
  public static void Buyerlist() throws BuyerException {
	
	    
	  AdminInterface  admin = new AdminImplemetation();
	  
	  admin.viewBuyerlist();
	  
	  
}
}
