package corejava;

import java.util.Scanner;

public class Reverse {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
System.out.println(" enter the string");
String name = input.next();
String reverse = "";



for ( int i =name.length()-1; i>=0; i--)
{
		
	reverse=reverse+name.charAt(i);		
}


	if (name.equals(reverse))
	{
		
		System.out.println("it is palindrome");
	
	}
		
	else {
			
			System.out.println("it is not palindrome");
		}
		
		
	}
}
		
		
	
	


