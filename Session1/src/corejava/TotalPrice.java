package corejava;

import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		System.out.print("please enter your item number");
		int Category=reader.nextInt();
		
	
		Scanner reader1=new Scanner (System.in);
		System.out.println("enter item name");
		String name=reader1.next();
		
		
		 
	         
		switch (Category){
		
		
		case 0:
		
		//System.out.print("the scanned item is shirt");
		double price =200;
		double tax =0.06;
		double Sum = (price +(price *tax));
		
		System.out.println("The total pruce for teh item is   "+Sum);
		break;
		
		case 1:
			
			//System.out.print("the scanned item is pant");
			double price1 =300;
			double tax1 =0.06;
			double Sum1= (price1 +(price1 *tax1));
			
			System.out.println("The total price for the item is "+Sum1);
			break;
			
			
         case 2:
			
			//System.out.print("the scanned item is cap");
			double price2 =300;
			double tax2 =0.06;
			double Sum2= (price2 +(price2 *tax2));
			
			System.out.println(" The total price for the item is  "+Sum2);
			break;
		
		default:
			System.out.println("the scanned item is not found");
		
	
		}
	         }
	}
