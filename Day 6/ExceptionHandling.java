import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * Exception handling: try...catch...finally...
 * throw and throws
 * Custom Exception in UR code
 * Abnormal condition that arises when UR app is executing due to a logical mismatch, invalid inputs either from the user or from the system that makes the app stop permanently is what is called as EXCEPTION. These abnormal conditions are generally called as RUNTIME ERRORS or EXCEPTION.
 * U handle any exceptions in Java using try...catch and an optional finally.
 * In Java, Exceptions are raised as objects of a class called java.lang.Throwable. This class is the root class for all Exceptions raised by the Java Execution Environment. Internally there are 2 subclasses from this class: Exception and Error
 * In Exceptions there are 2 kinds: Checked Exceptions and Unchecked Exceptions. 
 * Checked Exceptions are those which can be resolved at compile time itself by using some settings or code snippets. IOExceptions are those which U can check them at the compilation time.  
 * Unchecked Exceptions are those that cannot be checked at compile time but but only at runtime, NullPointerException could be found out only when U execute the program not during the compiling time. 
 * keywords used to handle Exceptions:
 * try: is a section of code that is anticipated to give an exception. Every try will be followed by a catch or finally or both. 
 * catch: is a section that follows a try which will contain the handling of the specific exception. In this case, the catch will take an object of the type of Exception that U wish to handle. There can be multiple catch blocks for a given try.
 * finally
 * throw
 * throws
 * */

//null is a default value for every reference type(Classes)...
//ensure or try in UR code, not to return null, instead throw an Exception....
//there are hundreds of such Exception classes and Error classes available in Java Libraries. So with experience, U will be able to get different kinds of Exception classes which U can handle with try..catch segments in UR Code. 
class Fruit{
	int id;
	String name;
	
	public Fruit(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class ExceptionHandling {
    static Scanner sn = new Scanner(System.in);
    
    //Function that takes a String as arg and should return the data from a hidden array if the STring is available in that hidden array...
    static String findFruit(String fruitName) throws Exception{
    	String[] fruits = new String[] {"Apples", "Mangoes", "Bananas", "PineApple", "Oranges", "Grapes", "Kiwi"};
    	for(String fr : fruits) {
    		if(fr.equals(fruitName))
    			return fr;
    	}
    	//throw must be followed by an instance of the class that U have mentioned in the throws statement
    	throw new Exception(String.format("The fruit by name %s is not available in our shop", fruitName));
    }
	public static void main(String[] args) {
		//simpleExceptionDemo();
		//divideByZeroDemo();
		//nullPointerDemo();
		//arrayIndexDemo();
		//throw and throws keywords are used to raise the exceptions in ur code.
		
		//throwAndThrowsDemo();
		//finally: Find out what finally is all about, should we specifically write finally, can we have finally without catch or try, can I have multiple finally, can I bye-pass finally in a function even if it is set?
	}
	private static void throwAndThrowsDemo() {
		String selectedFruit = MyConsole.getString("Enter the fruit name to add to the basket");
		//If a function that has throws keyword is called without exception handling, its error in Java.
		try {
			String output = findFruit(selectedFruit);
			System.out.println("The selected fruit is added to the basket");
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	private static void arrayIndexDemo() {
		int [] elements = new int[] {56,67,77,72,25};
		int index = 0;
		try {
			index = MyConsole.getNumber("Enter the index no to get the value in it");
			System.out.println(String.format("The value at position %d is %d" , index, elements[index]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(String.format("No element exists at position %d, value should be within %d" , index, (elements.length - 1)));
		}
		//Todo: Apply the looping feature to allow the user to retry entering the index position. 
	}
	private static void nullPointerDemo() {
		try {
			Fruit f = null; //in real time, the fruit is assigned using a function from a database...
			System.out.println("The Default value of fruit is "  + f.name);
		}catch(NullPointerException ex) {
			System.err.println("The Fruit info is not set properly");
		}
	}
	private static void divideByZeroDemo() {
		boolean condition = true;
		do {
			try {
				//Divide byZero which is an Arithmetic Exception...
				int first = MyConsole.getNumber("Enter the number to divide");
				int second = MyConsole.getNumber("Enter the non zero dividend value");
				int res = first / second;
				System.out.println("The quotient is " + res);
				condition = true;
			} catch (ArithmeticException ex) {
				//System.err.println(ex.getMessage());//getMessage is system generated message which a common user might not understand
				System.err.println("A number cannot be divided by 0, so please enter a valid Non Zero whole number");
				condition = false;
			}
		}while(!condition);
	}
	private static void simpleExceptionDemo() {
		System.out.println("Enter a number");
		//try without try block first....
		try {
			int no = sn.nextInt();
			System.out.println("The value: " + no);
		}catch(InputMismatchException miss) {//Java Runtime will create an object of this class and throw this exception to UR code which U catch...
			System.err.println("Expected a number as input within the range of " + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE); //err object is used to display Error information on Console..
		}
	}
}

