package com.AuctionUse;

import java.util.Scanner;

import com.AuctionColor.ConsoleColors;
import com.AuctionDao.SellerDao;
import com.AuctionDao.SellerImplemetation;
 
import Exception.CredentialException;
import Exception.SellerException;

public class SellerLOgin {
 
	
	 

	public static void main(String[] args) throws CredentialException, SellerException {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Mob No");
		String phone =  sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		SellerDao dao = new SellerImplemetation();
		
		
		String result;

		try {
			result= dao.SellerLogin(phone, pass);
			System.out.println(ConsoleColors.GREEN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + result + ConsoleColors.RESET);
			return;
			
		} catch (CredentialException e) {
			result = e.getMessage();
			System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + result + ConsoleColors.RESET);
			return;
		} catch (SellerException e) {
			result = e.getMessage();
			System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + result + ConsoleColors.RESET);
			return;
		}
		finally {
			sc.close();
		}
	}
	
	
}
