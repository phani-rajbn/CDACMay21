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
 * */
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//old style
		 ArrayList list = new ArrayList(); 
		 list.add("Apple"); 
		 list.add(123);
		 list.add(123.456); 
		 list.add(new Date()); 
		 list.add("Mango");
		 list.add("Orange"); 
		 list.add(321);
		 for(int i =0; i < list.size(); i++) { System.out.println(list.get(i)); }
		
		//Generics(new style)....
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apples");
		fruits.add("Mangoes");
		fruits.add("Oranges");
		for(int i =0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i).toUpperCase());
		}
	}
}
