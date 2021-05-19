
//ToDo: Create a new Class in Ecllipse and make it execute. 
/*
 * Access specifiers in Java is available for the feature of Encapsulation. Encapsulation is also called as Data Hiding. U can determine the scope of UR data within UR Application. Encapsulation also helps in creating business rules within the application. 
 * 4 access specifiers are available in Java
 * default: This is the default access specifier in java. It makes the members of the class accessible within the package(Unit) of the application.
 * private: Allows the member to be accessible within the declared class only. This is the most secured access specifier of java. 
 * public: It is available across the classes, packages, applications also.
 * protected: Allows to be accessible within the declared class and its inherited classes.     
 * */
class Example{
	//available anywhere....
	public void publicFunc() 
	{
		privateFunc();
		System.out.println("Public Function"); 
	}
	
	//only within the class to make Ur code more modular in nature. s
	private void privateFunc() { System.out.println("private Function"); }
	
	//available in the current group(Package)
	void defaultFunc() { System.out.println("default Function"); }
	
	//only here or in its derived classes.
	protected void protectedFunc() { System.out.println("protected Function"); }
}


public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		Example test; //Variable of a class but no memory is allocated
		test = new Example();//Creating an object of the class...
		//The object is nothing but a reference variable with memory allocated to it. 
		
		test.defaultFunc();
		test.publicFunc();
	}
}

/*
 * Create a Program that has the following features. 
	Function that takes an int Array as arg and return the max value in the array. 
	Function that takes an int Array as arg and return the min value in the array.
	Function that takes an int array as arg and return the avg value in the array. 
	Function that takes an Array(of any kind) as arg and return an Array object which contain the 		elements in the reverse order. Let the name of the function be called Reverse. 
 * 
 * */

