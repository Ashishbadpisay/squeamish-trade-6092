package com.AuctionDao;

import com.Auction_Model.Item;

import Exception.CredentialException;
import Exception.ItemException;
import Exception.SellerException;

public interface SellerDao {
	
    
//A. Register himself or herself as seller.
//B. Create list of items to sell.
//C. Update Item price, quantity, etc.
//D. Add new Item in the list.
//E. Remove items from the list.
//F. View the sold Item history.
//     
// 
	public String SellerLogin(String  sphone_no, String  spassword) throws CredentialException,SellerException;
	
	public Item SellItemList() throws ItemException;

}
