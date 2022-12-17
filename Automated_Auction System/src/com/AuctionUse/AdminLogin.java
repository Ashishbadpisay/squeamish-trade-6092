package com.AuctionUse;

import java.util.Scanner;

import com.AuctionColor.ConsoleColors;
import com.AuctionDao.AdminImplemetation;
import com.AuctionDao.AdminInterface;

import Exception.CredentialException;

 

public class AdminLogin {
	
	
	public static Boolean adminlog() {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username = sc.next();
		System.out.println("Enter Password : ");
		String password = sc.next();
		//sc.close();
		 AdminInterface dao = new  AdminImplemetation();
		
		String result;
		
		try {
			result = dao.Adminlog(username, password);
			System.out.println(ConsoleColors.GREEN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + result + ConsoleColors.RESET);
			return true;
			
			
		} catch (CredentialException e) {
			result = e.getMessage();
			System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + result + ConsoleColors.RESET);
			return false;
		}
		finally {
			sc.close();
		}
		
		
		
	}
	

}
