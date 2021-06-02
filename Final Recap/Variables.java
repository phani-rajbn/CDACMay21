//Variable represents the data that U want to store for a brief period of time. Variables could be modified. As they are can be modified, they are called variables. Variables will have scope depending where U have created them. 
//Variables are created based on the type of the data that U want to store in it. We declare the variables and use them in our code. 
//Java has precreated data types which can be used in ur app. java has 2 types of data types: primitive types or value types and reference types. Anything that is not primitive is reference type in Java. 
//primitive types are those that are there since ages, common among all programming languages
//integrals: byte, short, int, long.
//floating: float, double.
//Other types: char and boolean. 
//U should declare the variable before U use them. The place of declaration will determine the scope of the variable within ur program. variables declared in the function will be limited to the function itself. 
//variable is named as identifier. This should be unique to the scope of the variable. If U want to store another data, u should create a new variable or reassign the old variable with new value. At any given point of time in the execution, a variable can hold only one value in it.  
//naming the variables should be done in a professional manner. 
//System.console().readLine method to take inputs from the user...
//try creating variables of different kinds and see how it works.
//3 types of variables in declaration: local variable, static variable, instance variable. 
//variables created in a fn are called as local variables. they are scoped only within the function. 
//variables created in the class level are called as instance variables and in OOP terms we call them as data members.
//static variables are those that maintain single scope across the application. they give the feature of global variables where U can access them anywhere given the accessiblity of it. static variables are not relative to an instance, rather it is for the complete class. so static variables are declared within the class, refered using the name of the class.  
//static variables are declared like instance variables(at the class level). however we use them using the classname instead of any instance of a class. 
//modify this code to take inputs from the user instead of hard coding the values. display the result on the screen. 
class Variables{
	public static void main(String[] args) {
	     double firstValue = 23.546;//My variables will store only whole numbers. 
	     double secondValue = 34.234;
	     double result = firstValue + secondValue;
	     System.out.println("The result of addition is " + result);	

	     //widening of value..
	     int x = 123;
	     double dVal = x;//double has large range with ability to hold decimal values.
	     System.out.println(dVal);//What will it display?

	     //narrowing of the value...
	     short sVal = (short)dVal;	//error
		 System.out.println(sVal);

		 //overflowing of the value..
		 int smallValue = 4567;
		 byte verySmallValue = (byte)smallValue;//typecasting is not safe, U might get abnormal results. 
		 System.out.println(verySmallValue);//What is the output of this statement		 		    
		 //Find out the range of every numeric primitive type in Java. Write a program that display the max and min value of every primitive numeric type. TIP: Use wrapper classes. 
	}
}