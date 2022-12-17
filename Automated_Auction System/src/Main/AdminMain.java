package Main;

import com.AuctionColor.ConsoleColors;
import com.AuctionDao.AdminImplemetation;
import com.AuctionDao.AdminInterface;
import com.AuctionUse.AdminLogin;
import com.AuctionUse.ViewBuyerList;

import Exception.BuyerException;

public class AdminMain {
	
	public static Boolean adminlog() {
		
		AdminLogin admin = new AdminLogin();
		Boolean  result  = AdminLogin.adminlog() ;
 		return result;	
	}
	
	
//	 public  static void Buyerlist() throws BuyerException {
//		 AdminInterface ad = new AdminImplemetation();
//		 try {
//			ad.viewBuyerlist();
//		} catch (BuyerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new BuyerException("Buyer not found");
//		} 
//		  
//		 
//	 }
	

}
