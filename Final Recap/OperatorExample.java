//Arithematic: +, -, *, / 
//Rational: <, >...
//logical operators: &&, ||
//ternery operators: ? ://short cuts for if condition. 
//Assignment: = + -= 

class OperatorExample{
	public static void main(String[] args) {
		//Operator is basically a symbol to perform a certain predefined operation. Unlike C/C++ U cannot modify the way the predefined operators work in Java. They say it will confuse the programmer. 

		int x = 12, y = 13;
		System.out.println(x + y);//display the output.

		String name ="Phaniraj";
		String profession = " Trainer";
		System.out.println(name  + profession);//What is the output? concatinates.  

		//Ternery operator:
		int v1 = 12, v2 = 15;
		int minValue = (v1 < v2)? v1 : v2;
		
		System.out.println("The min value of the 2 numbers is " + minValue);
	}
	//TODO: Write a program that takes inputs from the user and performs mathematic operation and displays the added, subtracted, multiplied and dividied values one line after the other. 
}