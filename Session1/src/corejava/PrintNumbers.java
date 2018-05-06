package corejava;

import java.util.Scanner;

public class PrintNumbers
{

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println ("enter the first number");
		int value = input.nextInt();
		
	

		Scanner input1 = new Scanner (System.in);
		System.out.println("enter second number");
		int value1 = input1.nextInt();
		
		
		for (int i=value;i<=value1;i++) {
			System.out.println(i);
		}
			
		}
}
		
		
		
		
		