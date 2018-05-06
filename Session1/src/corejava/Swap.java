package corejava;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//entering the numbers before swapping 
	


Scanner input = new Scanner(System.in);
System.out.println("a=");
System.out.println("b= ");
int a = input.nextInt();
int b = input.nextInt();
int temp;

	
temp=a;
a=b;
b=temp;

System.out.println("a = "+a);
System.out.println("b = "+b);
	}
}
