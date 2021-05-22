//A method in java can have parameters. parameters are inputs to be provided for a method to be invoked properly. There are 2 ways in which U can pass a variable data to a method. 
//Pass By Value: It is a process in which the function parameter values are copied to an another variable and used in the function. any changes U make to the variable will not be reflected back to the variable after the function has returned. This is a feature in Java. All primitive types follow this pattern. Java does not have a mechanism of passing value types as reference parameters.  Java is strictly passed by value...
//Pass By Reference: the same variable will be passed as argument, so any change made to this function will be reflected back to the calling function. In this way, u could have created a method that returns more than one value from its call. This feature is available in C++, C# and VB. However, objects of classes are reference types, they are passed as reference copies only.  
//In java, pass by value is only for primitive types and pass by reference is only for reference types(Classes).

class Customer{
	public int cstId;
	public String cstName;
	
	public Customer(int id, String name) {
		cstId = id;
		cstName = name;
	}
}



public class ParametersDemo {

	//Pass by value
	static void passByValue(int someData) {
		System.out.println("The value passed to the function: " + someData) ;
		someData += 3456;
		System.out.println("The value modified in the function: " + someData);
	}
	
	static void passReferenceObject(Customer cst) {
		cst.cstName = "Changed Name";
	}
	public static void main(String[] args) {
		int someData = 123;
		passByValue(someData);//Variable is not passed, a copy of it will be passed. So any change U make in that function will be applicable only to the copy, not to the original variable. So changes made inside the function will be only to the copy and once the function returns, the copy is destroyed. 		
		System.out.println("After coming back from the function: " + someData);
		
		System.out.println("///////////////////////////////////////////////////////");
		
		Customer cst = new Customer(123, "Phaniraj");
		passReferenceObject(cst);//The copy is an alias to the cst. Both the copy and the object will be pointing to the same memory, any changes U make to the object inside the function will be reflected back to the actual object as both are pointing to the same memory. Hence they are called as REFERENCE TYPES as the share the same reference across the application unless U explicitly create a new object.
		System.out.println("The customer name after the function call: " + cst.cstName);
		
		//A copy in reference type Stand point is it is same object with different name.
		Customer copy = cst;//copy and cst are same, any change U make to any one of them, it will be reflected on the other.
		copy.cstName ="Apple123";
		System.out.println(cst.cstName);
	}

}
