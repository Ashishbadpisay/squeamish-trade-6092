package com.Auction_Model;

public class Buyer {
	
	private int Bid;
	private String Bname;
	private String Bemail;
	private String Bpnone;
	private String Baddress;
	private String Bpassword;
	private String BuyerDate;
			 
	public Buyer() {
		// TODO Auto-generated constructor stub
	}

	public Buyer(int bid, String bname, String bemail, String bpnone, String baddress, String bpassword,
			String buyerDate) {
		super();
		Bid = bid;
		Bname = bname;
		Bemail = bemail;
		Bpnone = bpnone;
		Baddress = baddress;
		Bpassword = bpassword;
		BuyerDate = buyerDate;
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getBemail() {
		return Bemail;
	}

	public void setBemail(String bemail) {
		Bemail = bemail;
	}

	public String getBpnone() {
		return Bpnone;
	}

	public void setBpnone(String bpnone) {
		Bpnone = bpnone;
	}

	public String getBaddress() {
		return Baddress;
	}

	public void setBaddress(String baddress) {
		Baddress = baddress;
	}

	public String getBpassword() {
		return Bpassword;
	}

	public void setBpassword(String bpassword) {
		Bpassword = bpassword;
	}

	public String getBuyerDate() {
		return BuyerDate;
	}

	public void setBuyerDate(String buyerDate) {
		BuyerDate = buyerDate;
	}

	@Override
	public String toString() {
		return "Buyer [Bid=" + Bid + ", Bname=" + Bname + ", Bemail=" + Bemail + ", Bpnone=" + Bpnone + ", Baddress="
				+ Baddress + ", Bpassword=" + Bpassword + ", BuyerDate=" + BuyerDate + "]";
	}
	
	
     
}
