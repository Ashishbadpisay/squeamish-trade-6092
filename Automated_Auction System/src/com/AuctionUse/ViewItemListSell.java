package com.AuctionUse;

import com.AuctionDao.SellerDao;
import com.AuctionDao.SellerImplemetation;

import Exception.ItemException;

public class ViewItemListSell {
	public static void main(String[] args) {
		SellerDao dao = new SellerImplemetation();
		 try {
			dao.SellItemList();
		} catch (ItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
