package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.AuctionColor.ConsoleColors;
import com.AuctionUse.ViewBuyerList;
import com.AuctionUse.ViewDispute;
import com.AuctionUse.viewSeller;
import com.AuctionUse.viewSellingDetails;

import Exception.BuyerException;

 

public class Main {
	
	public static void appOpening() throws InputMismatchException {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(ConsoleColors.BROWN_BACKGROUND+ConsoleColors.WHITE_BOLD_BRIGHT+"Welcome to Online Auction Application : "+ ConsoleColors.RESET);
			System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Choose Login Option from Below According to your Designation  : " + ConsoleColors.RESET);
			System.out.println("Press 1 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " logIn as Admin." + ConsoleColors.RESET);
			System.out.println("Press 2 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " logIn as Seller"+ ConsoleColors.RESET);
			System.out.println("Press 3 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " logIn as Customer"+ ConsoleColors.RESET);
			System.out.println("Press 4 to" +ConsoleColors.PURPLE_BOLD_BRIGHT +" EXIT."+ ConsoleColors.RESET);
			String choice = sc.nextLine();
		
			if(choice.equals("1")) {
				
				//System.out.println("bdo");
				
				//AdminMain admin = new AdminMain();
				//BdoMain bmain = new BdoMain();
				Boolean result =  AdminMain.adminlog();
				
				int countAdminLogin =1;
				
				while(!result) {
					countAdminLogin++;
					//System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);
					//System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);++;
					System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + (4-countAdminLogin) +" Attempts remaining"+ ConsoleColors.RESET);
					result = AdminMain.adminlog();
					
					
					if(countAdminLogin ==3 && result ==false) {
						System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "Maximum Limit Crossed : Try Again Later"+ ConsoleColors.RESET);
						break;
						
					}
				}
			
				
			}
//			 
//			}else if(choice.equals("4")) {
//				
//				
//				System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "APPLICATION CLOSED : EXITED" + ConsoleColors.RESET);
//				System.exit(0);
//			}
			
//			else {
//				System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "CHOOSE CORRECT INPUT RANGE FROM 1 TO 4" + ConsoleColors.RESET);
//
//				//appOpening();
//		}
		}
			catch(InputMismatchException e) {
				System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);
				throw new InputMismatchException("Mismatch the input");
			}
		 
		// public  static void   viewBuyerlist() throws BuyerException{	
	}
	
	public static void viewBuyerlist() throws BuyerException{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " View Buyerlist." + ConsoleColors.RESET);
			System.out.println("Press 2 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " View Registerd Seller lis"+ ConsoleColors.RESET);
			System.out.println("Press 3 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " View Daily Dispuste list"+ ConsoleColors.RESET);
			System.out.println("Press 4 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " View Daily Selling Report"+ ConsoleColors.RESET);
			System.out.println("Press 5 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Solve Dispute report"+ ConsoleColors.RESET);
			System.out.println("Press 6 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " EXIT. "+ ConsoleColors.RESET);
			
			String choice = sc.nextLine();
		
			if(choice.equals("1")) {
				
				 ViewBuyerList b = new ViewBuyerList();
				 b.Buyerlist();
			}
			else if(choice.equals("2")) {
				 viewSeller s = new viewSeller();
				 s.SellerDetails();
			}
			else if(choice.equals("3"))
			{
				ViewDispute dispute = new ViewDispute();
				dispute.viewDisputeDetails();
			}
			else if(choice.equals("4")) {
				viewSellingDetails sd = new viewSellingDetails();
				 sd.viewsellDetails();
			}
				
			}
			catch(BuyerException e) {
				System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + e.getMessage() + ConsoleColors.RESET);
				throw new BuyerException("Buyer not found ");
			}
//            
			 
	}
//	
	public static void main(String[] args) {
		 
	 appOpening();
    
	 try {
		viewBuyerlist();
	} catch (BuyerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 
	 
	 
	 
	 
	 
	}


	
 

}
