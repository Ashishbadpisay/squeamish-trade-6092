package com.Auction_Model;

public class Seller {
	
	 private int  sid;
	 private String Sname;
	 private String Item_Type;
	 private int  Item_bidPrice; 
	 private int Total_order_quantity;  
	 private double  Total_order_amount;
	 private String orderDate;
	 String  sphone_no;
	 String  spassword; 
	 private int Bid;
	 public Seller() {
		// TODO Auto-generated constructor stub
	}
	public Seller(int sid, String sname, String item_Type, int item_bidPrice, int total_order_quantity,
			double total_order_amount, String orderDate, String sphone_no, String spassword, int bid) {
		super();
		this.sid = sid;
		Sname = sname;
		Item_Type = item_Type;
		Item_bidPrice = item_bidPrice;
		Total_order_quantity = total_order_quantity;
		Total_order_amount = total_order_amount;
		this.orderDate = orderDate;
		this.sphone_no = sphone_no;
		this.spassword = spassword;
		Bid = bid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getItem_Type() {
		return Item_Type;
	}
	public void setItem_Type(String item_Type) {
		Item_Type = item_Type;
	}
	public int getItem_bidPrice() {
		return Item_bidPrice;
	}
	public void setItem_bidPrice(int item_bidPrice) {
		Item_bidPrice = item_bidPrice;
	}
	public int getTotal_order_quantity() {
		return Total_order_quantity;
	}
	public void setTotal_order_quantity(int total_order_quantity) {
		Total_order_quantity = total_order_quantity;
	}
	public double getTotal_order_amount() {
		return Total_order_amount;
	}
	public void setTotal_order_amount(double total_order_amount) {
		Total_order_amount = total_order_amount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getSphone_no() {
		return sphone_no;
	}
	public void setSphone_no(String sphone_no) {
		this.sphone_no = sphone_no;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	@Override
	public String toString() {
		return "Seller [sid=" + sid + ", Sname=" + Sname + ", Item_Type=" + Item_Type + ", Item_bidPrice="
				+ Item_bidPrice + ", Total_order_quantity=" + Total_order_quantity + ", Total_order_amount="
				+ Total_order_amount + ", orderDate=" + orderDate + ", sphone_no=" + sphone_no + ", spassword="
				+ spassword + ", Bid=" + Bid + "]";
	}
   
	
	
}
