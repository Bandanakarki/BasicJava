package corejava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		
		System.out.println("enter number= ");
	
		int j= input.nextInt();
		
		if (j % 2==0) {
			System.out.println("it is even");
		}
			
			else {
				System.out.println("it is odd");
			}
		
		
	}
}


