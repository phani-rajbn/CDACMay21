//ThirdExample.java
/*
Data types are units in an Application that will allow to store differnt kinds of data depending on the kind of data U wish to store, wholenumbers(int), decimal(float), single charecters, bunch of charecters, true or false, date and Time are some of the popular used kinds of data that UR app works. The kind of data that U declare is called as Data type.
Java has broadly 2 types of data: primitive or Value types and reference types.
primitive types are those that are common on all computer languages and is used to represent single kind of data. 
reference types are for classes or User defined types. 
In primitive types:
Integral values: byte, short, int, long...
Floating Types: float, double...
Other types: char, bool.....
TO perform conversions and data manipulations, Java has created WRAPPER Classes for each primitive type, so that it can be used to perform operations like string conversions in it. The common operations:
//valueOf: create a wrapper object of a given string. 
//parseXXX : Used to convert the string value to its type
//toString: Convert the value to String
//xxxValue" gets the primitive part of the given wrapper objects.
//Most of these methods are static, U can invoke these methods thru' the name of the class instead of its variable(object). 

*/
class ThirdExample{
	public static void main(String[] args) {
		System.out.println("Enter a number");
		String value = System.console().readLine();//Input from the user
		int iVal = Integer.parseInt(value);//converting the input to a specific type. 
		System.out.println("The value entered is " + iVal);
	}
}

//ja9a4c7r