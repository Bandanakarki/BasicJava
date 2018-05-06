package corejava;

import java.util.Scanner;

public class MainMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Scanner reader = new Scanner(System.in);
					System.out.println("what do you want to do?");
					String name = reader.next();
		
					MathFunc operation=new MathFunc();    
				    int i; 
				    Scanner reader1 = new Scanner(System.in);
				System.out.println("enter the number");
					int value = reader1.nextInt();
				    
				  
				 	
				     
				     if (name.equalsIgnoreCase("square"))
				     {
				   System.out.println(operation.square(value));
				     }
				     else if (name.equalsIgnoreCase("cube")) {
					 
					 System.out.println(operation.cube (value));
				
			}
				     else {
				    	 System.out.println(" invalid number");
				     }
				     
				     

				     

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
