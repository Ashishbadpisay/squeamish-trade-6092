package com.AuctionDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AuctionUtility.Utility;
import com.Auction_Model.Item;

import Exception.CredentialException;
import Exception.ItemException;
import Exception.SellerException;

public class SellerImplemetation implements SellerDao{
	public static int storesid;
/*---------------------------------------sellerLogin------------------------------------------------------------------*/
	@Override
	public String SellerLogin(String sphone_no, String spassword) throws CredentialException, SellerException {
    String result = "Log In failed";
		
		try (Connection conn = Utility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from Seller");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				String phoneNumber = rs.getString("sphone_no");
				String pass = rs.getString("spassword");
				
				if(phoneNumber.equals(sphone_no) && pass.equals(spassword)) {
					result = "login Sucessful!";
					storesid = rs.getInt("sid");
					return result;
				}
					
					
			}
			result = "Wrong Credential";
			throw new CredentialException(result);
			
		} catch (SQLException e) {
			throw new  SellerException(e.getMessage());
		}		
	}
	@Override
	public Item SellItemList() throws ItemException {
		 Item item = null;
		 
		 try( Connection con=Utility.provideConnection()){
			 
			 
			PreparedStatement ps= con.prepareStatement("select * from item");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	String product = rs.getString("product");
		    	int price  = rs.getInt("price");
		    	int quan   = rs.getInt("quantity");
		    	String Sold = rs.getString("sold");
		    	
		      item = new Item(product, price, quan, Sold);
//		    	item.setProduct(product);
//		    	item.setPrice(price);
//		    	item.setQuantity(quan);
//		    	item.setSold(Sold);
		    	
		    	System.out.println("Product : "+item.getProduct()+"Price : "+item.getPrice()+" Quan :"+item.getQuantity()+" sold : "+item.getSold());
		    }
			
			
		 }catch(SQLException e) {
			 System.out.println(e.getMessage());
			 throw new ItemException("Item NOt Found");
		 }
		 
		 
		 
		 
		 
		return item;
	}
	
	/*---------------------------------------sellerLogin------------------------------------------------------------------*/
 
 
	
	

}
