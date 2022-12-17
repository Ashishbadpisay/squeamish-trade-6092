package com.AuctionDao;

 
 

import com.Auction_Model.Buyer;
import com.Auction_Model.Seller;

import Exception.BuyerException;
import Exception.CredentialException;
import Exception.SellerException;

public interface AdminInterface {
	public final String username = "Admin";
	public final String password = "Admin";
	
	
	public String  Adminlog(String username, String password) throws CredentialException;
	
	
//        A. View the registered buyer list.
	
	
	
   public Buyer  viewBuyerlist() throws BuyerException ;
	
   public Seller  viewSellerlist ()  ;
   public  void  Dispute();
   public void  DetailsOfDailyselling();
	

}
