package corejava;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// for string
				
			
				
		Scanner reader = new Scanner (System.in);
		System.out.print("What is your name?");
		String name=reader.next();
		System.out.println("Your name is "+name);

		//for int
		
		Scanner reader1 = new Scanner (System.in);
		System.out.print("What is your age?");
		String age=reader1.next();
		System.out.println("Your age is "+age);
		
		
		
	}

}
