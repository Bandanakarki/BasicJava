package corejava;

public class If_And_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 100;
		int j=200;
		int a=300;
		System.out.println(i);
		System.out.println(j);
		System.out.println(a);

		if (i<j)
			System.out.println("i is less than j");
			else
				System.out.println("i is not less than j");
		//if you are comparing two variables you need to put ==
		//if you are assigning a value to teh variable you should use =,example i=100;
		if(j==a)
			System.out.println("j is less than a");
		else
			System.out.println("j and a are equal");
		if(j<a)
		{
			System.out.println("j is greator then a");
		}
		else
		{
			System.out.println("j is less than a");
		}
		}
	}


