package com.AuctionUse;

import com.AuctionDao.AdminImplemetation;
import com.AuctionDao.AdminInterface;

public class viewSellingDetails {
	public static void viewsellDetails() {
		AdminInterface adm = new AdminImplemetation();
		adm.DetailsOfDailyselling();
	}

}
