package com.AuctionDao;

 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AuctionColor.ConsoleColors;
import com.AuctionUtility.Utility;
import com.Auction_Model.Buyer;
import com.Auction_Model.Seller;

import Exception.BuyerException;
import Exception.CredentialException;
import Exception.SellerException;

public class AdminImplemetation  implements AdminInterface  {
	
/* --------------------------------login into Admin Account --------------------------------------------------------- */

	 

@Override
public String Adminlog(String username, String password) throws CredentialException {
	 String result = "Invalid Credentials!";
		
		if (username.equals(AdminInterface.username) && password.equals( AdminInterface.password)) {
			 result = "Welcome to Admin Account. Login Successful!";
		}else {
			throw new CredentialException(result);
		}
		return result;	
}


/*------------------------------viewBuyerlist-----------------------*/

@Override
public Buyer viewBuyerlist() throws BuyerException {
	Buyer buy =null;
	//System.out.println("Buyer");
	try(Connection con=Utility.provideConnection()) {
		  
		
		 PreparedStatement ps=con.prepareStatement("select * from Buyer");
		  ResultSet rs= ps.executeQuery();
	 
		while(rs.next()) {
			 int eid = rs.getInt("Bid");
			String name = rs.getString("Bname");
		    String email=rs.getString("Bemail");
		    String phone = rs.getString("Bpnone");
		    String Adres = rs.getString("Baddress");
		    String pass = rs.getString("Bpassword");
		    String date = rs.getString("BuyerDate");
		    
		    Buyer b1 = new Buyer(eid, name, email, phone, Adres, pass,date);
			
			 System.out.println(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Bid :  "+b1.getBid()+"  Bname : "+b1.getBname()+"   Bemail : "+b1.getBemail()+"   Phone : "+b1.getBpnone()+"  Adress : "+b1.getBaddress()+"  password : "+b1.getBpassword()+
					 "   Purchase Date"+b1.getBuyerDate());
		}
		
		
		
		
		
	} catch (Exception e) {
		 e.printStackTrace();
		 throw new BuyerException("Buyer is no found");
	}
	
	
	
	
	
	return buy;
}



 
/*-----------------------------------------End ViewBuyerlist--------------------------*/
	
/* --------------------------------------- seller Start................................*/



@Override
public Seller viewSellerlist(){
	Seller sell =null;
	//System.out.println("Buyer");
	try(Connection con=Utility.provideConnection()) {
		  
		
		 PreparedStatement ps=con.prepareStatement("select * from Seller");
		  ResultSet rs= ps.executeQuery();
	     //  sid  | Sname          | Item_Type  | Item_bidPrice | Total_order_quantity | Total_order_amount | orderDate  | sphone_no  | spassword | Bid
		while(rs.next()) {
			 int sid = rs.getInt("sid");
			String name = rs.getString("Sname");
		    String type =rs.getString("Item_Type");
		    int bidprice = rs.getInt("Item_bidPrice");
		    int total_order_quant = rs.getInt("Total_order_quantity");
		    int total_order_amount = rs.getInt("Total_order_amount");
		    String orderDate = rs.getString("orderDate");
		    String spnone = rs.getString("sphone_no");
		    String pass = rs.getString("spassword");
		   int Bid = rs.getInt("Bid");
		    
		     sell = new Seller();
			sell.setSid(sid);
			sell.setSname(name);
			sell.setItem_Type(type);
			sell.setItem_bidPrice(bidprice);
			sell.setTotal_order_quantity(total_order_quant);
			sell.setTotal_order_amount(total_order_amount);
			sell.setOrderDate(orderDate);
			sell.setSphone_no(spnone);
			sell.setBid(Bid);
			System.out.println(ConsoleColors.CYAN_BRIGHT+ConsoleColors.BOXING);
System.out.println("sid : "+sell.getSid()+" Name : "+sell.getSname()+"  type : "+sell.getItem_Type()+" Price : "+sell.getItem_bidPrice()+"  order_Quant : "+sell.getTotal_order_quantity()+" Total amount :"+sell.getTotal_order_amount()+" Phone No :" + sell.getSphone_no() + "  order_Date : " +sell.getOrderDate()+" Bid : "+sell.getBid());
		 // System.out.println(sell.getBid());
			
			  
		}
		 
	} catch (Exception e) {
		 e.printStackTrace();
		//  throw new SellerException("seller no found"); 
	}
	
	
	
	
	
	return sell;
}





 
/* --------------------------------------- seller End................................*/

/*----------------------------------------Dispute-----------------------------------*/
 

@Override
public void Dispute() {
	// TODO Auto-generated method stub
	
	try( Connection con =Utility.provideConnection()) {
		PreparedStatement ps=con.prepareStatement("select * from  Dispute");
		 ResultSet rs= ps.executeQuery();
		 while(rs.next()) {
			 int sid = rs.getInt("sid");
			 int bid = rs.getInt("bid");
			 String Product_Name = rs.getString("product_name");
			 String status = rs.getString("status");
			 
			 System.out.println(ConsoleColors.BLACK_BACKGROUND+"Sid : "+sid+" bid : "+bid+" Product Name : "+Product_Name+ " status : "+ status);
			 
		 }
		
	} catch (SQLException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	
}






/*----------------------------------------Dispute End  -----------------------------------*/


/*----------------------------------------.View the daily selling report.-----------------------------------*/


@Override
public void DetailsOfDailyselling() {
	try( Connection con =Utility.provideConnection()) {
		PreparedStatement ps=con.prepareStatement("select sum(Total_order_quantity),sum(Total_order_amount),orderDate from Seller group by orderDate");
		 ResultSet rs= ps.executeQuery();
		 while(rs.next()) {
			 int sum_total_orderperDay = rs.getInt("sum(Total_order_quantity)");
			 int sum_total_amount = rs.getInt("sum(Total_order_amount)");
			 String Date = rs.getString("orderDate");
			 System.out.println("sum_total_order : "+sum_total_orderperDay+" Sum_total_amount :"+sum_total_amount+ " date :"+Date);
			 
		 }
		
	} catch (SQLException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	
	
	
	
	
	
	 
	
}
 




/*----------------------------------------.View the daily selling report.-----------------------------------*/



}