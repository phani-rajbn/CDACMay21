class Baseclass{
	//Default
	public Baseclass() {
		System.out.println("base class is created");
	}
	//Parameterized
	public Baseclass(String arg) {
		this();//One constructor calling the other....
		System.out.println("base class is created with String arg " + arg);
	}
	public Baseclass(int arg) {
		System.out.println("base class is created with int arg " + arg);
	}
}

class Derivedclass extends Baseclass{
	//Will call the default constructor implicitly. If there is no default constructor, then it is the responsibility of the derived class to call the specific base class constructor... 
	public Derivedclass() {
		super("String arg");
		//super(123);//U must call it explicitly. 
		System.out.println("Derived class is created");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		Derivedclass cl = new Derivedclass();
	}

}
/*PTR:
 * Base class default constructor will be invoked internally when U create the object of the derived class. 
 * If the derived class has to call the specific constructor of the base if it is overloaded, then U can do so by using super keyword which refers to the immediate base class and call the specific version by providing appropriate parameters.  
 * Even if the base class does not have default constructor, then the derived class constructor must call any one of the parameterized constructor. 
 * ToDo: Find out what Destructors are and what they do in Java, can we call it using code?, can it be parameterized?
 * ToDo: Final classes in java: Purpose and its significance in OOP.  
*/

/*
 * Develop an Single User application that stores Movie reviews that the user views. It will have 2 functions: Add a Movie review and Search for all Reviews on a Movie. 
 * It should be menu driven program where user can make choices and perform the operation. The App should be running continuously until the user wishes to close the application, of course thru' a menu choice. 
 * To Add Review to Movie------>Press 1
 * To Find Review for a movie---> Press 2
 * PS: any other key is considered as exit of the app....
 * */




