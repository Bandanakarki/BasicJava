package corejava;

//rule of thumb:
//it is an instance method that usually has the same name as class;
//it is used for assigning a new value;
//must be always a non-static (variable and function)



public class Constructor {
int age;             // always uses a non-static variables for constructors; do not use a static variables for constructor
int salary;
int house;
String name;
Constructor(){
	int age = 7;
	int salary = 1000;
	int house =7;
	String name = "John";
	System.out.println(age);
	System.out.println(salary);
}


public static void main (String[]args) {
	//TODO
	Constructor x = new Constructor();
	System.out.println(x.age);//non-static variables are the  instance of an object so an object is to be created
}
}













