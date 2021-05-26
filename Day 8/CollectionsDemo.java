import java.util.*;

/*
 * Arrays are fixed in size, are not flexible, hard to be implemented for dynamic data.So we use collections
 * Collections is the important framework for developing large scale Java apps with dynamic data coming in and going out of the application. 
 * It gives a set of Interfaces, Classes and Methods to perform operations on in memory data structures and meet the business requirement with little or less effort.
 * Structure which allows to add, remove, insert into the collection with less code(ArrayList) 
 * Structure similar to the above but should store only unique values in it. (HashSet)
 * Structure which store the data in the form of key-value pairs.UserName-Password, ATMCard-PIN(HashMap)
 * Structure that will allow to have nodes and child nodes to move across the collection. (TreeSet)
 * A Collection is a group of objects(of the same type) represented as one unit on which U could perform some common operation using a simple iterative methods. 
 * Framework is more like a bunch of ready to use classes for performing operations of an application. The group of classes are designed to address common issues of real time apps and will be given to the developers for their application development. It is a ready made architecture. 
 * It will contain lots of classes and interfaces, with classes U can use them and extend them to ur customization. With interfaces U can create new set of classes to satisfy specific requirements of UR App from the scratch.  
 * Collection Framework is a unified group of classes and interfaces created to perform Collection based operations. It contains interfaces and its implementations based on various time tested algorithms.
 * There is a new version of Collections with Generic (Templates) since Java 5. They are now recommended to be used instead of old non generic Collections. 
 * Non Generic(Old) Collections would store the data as objects and would store all kinds of data. This was unsafe as the purpose of the collections are lost. So Generic gave Type safe collections. Our Examples are focused on Generic Collection.  
 * Collection classes are defined under java.util package.
 * 
 * */
//Any one: try to create a class, and create a hashset<Class> and try to add same object into the collection and see what happens...

public class CollectionsDemo {

	public static void main(String[] args) {
		//arrayListExample();
		//hashSetExample();
		//hashValueExample();
		String value = "Apple";
		System.out.println(value.hashCode());
		
		value ="Mango";
		System.out.println(value.hashCode());
	}
	//Tomorrow: HashSet on custom Data types, Dictionary, Queue, Stack, TreeMap. 
	private static void hashValueExample() {
		// TODO Auto-generated method stub
		String temple = "Siddi Vinayak Temple";
		//String newTemple = "MahaLakshmi Temple";
		String newTemple = "Siddi Vinayak Temple"; // = operator in String will create a new object every time U assign a new value to it. Strings are immutable. Once the String is created, it cannot be modified. If U modify, it is a new String and the old string is garbage collected. TRY IT WITH AN EXAMPLE....
		
		System.out.println(temple.hashCode());
		System.out.println(newTemple.hashCode());
		
		newTemple = temple;//share the same memory and also their hashcode...
		System.out.println(temple.hashCode());
		System.out.println(newTemple.hashCode());
		
	}
	private static void hashSetExample() {
		
		//hashCode is a unique no generated for every new object for a given Execution instance. 
		Set<String> basket = new HashSet<String>();//Stores only unique data in it.....
		basket.add("Tomatoes");
		if(!basket.add("Tomatoes"))System.out.println("Tomatoes already added to the basket");
		basket.add("Tomatoes");
		basket.add("Tomatoes");
		basket.add("Tomatoes");
				
		System.out.println("The total no of Items: " + basket.size());
		//Set uses a concept called Hash Value to identify each object. If 2 objects share the same HashValue, it means that they belong to the same data type and will further call its equals method to evaluate the equivalence of the 2 objects. If both objects are same, then it wont add to the Set. 
		}
	//<> can hold any kind of data type that is recognized by Java. 
	private static void arrayListExample() {
		/*
		 * All functionalities are similar to Array. 
		 * Added functions to insert, remove, find, bulk insertion and bulk Deletion. 
		 * Data will be inserted from top to bottom. 
		 * U can have duplicate data in it. 
		 * It does not sort by itself, however U can sort the data based on a specific comparison criteria. 
		 * */
		List<String> names = new ArrayList<String>();
		names.add("Gopal");//adds to the bottom of the List. 
		names.add("Abhijit");
		names.add("Swapnil");
		names.add("Mishra");
		names.add("Sneha");
		names.add(3, "Srujan");//inserts in b/w using index
		for(String name : names) System.out.println(name); //Using for each
		
		for (int i = 0; i < names.size(); i++) { //using for loop....
			System.out.println(names.get(i));
		}
		//Remove the element in the list at any position....
		//TODO: try calling the other APIs like remove, remove at
		//Convert the List to Array in 2 different formats...
		Object [] allRecords = names.toArray();//Convert the list to Object []
		
		//I want the caller of my function only get the data not to manipulate the data. 
		String[] myNames = new String[names.size()];
		myNames = names.toArray(myNames);
		for (int i = 0; i < myNames.length; i++) {
			System.out.println(myNames[i]);	
		}
	}
}












