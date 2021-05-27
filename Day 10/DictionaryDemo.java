import java.util.*;

//Maps are the way of storing data in the form of key-value pairs. In this case, the key part of the element is unique to the collection, value can be same. In Java they are called as MAPs. 
//Maps store the data as pairs, HashMap is the class that implements Map in Java.
//KeyType and the valueType can be of different data types. Once the data type set in the constructor, then U can store the data of that kind only..
//U can check for a key using containsKey and then work accordingly. 
//Examples: ATMCard-Pin, UserName-Password, EmpID-EmpDetails.

//TODO: Find out the significance of a class called LinkedHashMap that is derived from HashMap. 
public class DictionaryDemo {
	static Map<String, String> users = new HashMap<String, String>();
	private static void addElementsToMap() {
			users.put("phaniraj", "Apple123");
			users.put("Prajwal", "Mango123");
			users.put("Ramesh", "appLE123");
			users.put("Ankith", "MiPwd123");
			users.put("phaniraj", "someThing");//Duplicate. It replaces the value of the key that is already existing. This might create a problem. So check for the key before U put into the collection.  
			System.out.println("The no of Users: " + users.size());
	}
	
	
	private static void displayAllElements() {
		
		Set<String> keys = users.keySet();//Get all the keys from the Map...
		for(String key :keys) {//Iterate thru all the keys and get the value associated with the key...
			System.out.println("Key: " + key);
			System.out.println("Value: " + users.get(key));//key is more like index of the collection.
		}
	}
	
	public static void iteratingMap() {
		for(Map.Entry<String, String> entry : users.entrySet()) {
			//System.out.println(entry);
			System.out.println("The Key: " + entry.getKey());
			System.out.println("The Value: " + entry.getValue());
		}
	}
	
	private static void usingLambdaExpression() {
		users.forEach((key, value) -> System.out.println(String.format("%s-%s", key, value)));
	}
	public static void main(String[] args) {
		//Map is the interface and HashMap is the class that implements that interface. 
		
		try {
			addElementsToMap();
			//Convert the data into a Set and read the data using it.
			displayAllElements();
			//remove will remove the pair from the collection. It returns the value that was associated with the key that was removed. 
			users.remove("Ankith");
			//Iterating thru' the Map with out extracting KeySet. In this case, U iterate thru' then key-value pairs and extract the key and value per entry of the collection.  
			iteratingMap();
			usingLambdaExpression();			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
