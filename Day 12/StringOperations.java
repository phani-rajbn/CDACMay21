/*
 * Java gives a new data type for manipulating array of characters called String. Core C++ did not support the concept of String  and was a data type in it. String is a reference type that internally hold array of characters in it. Use an API called toCharArray to convert UR string to a char [] so that U could iterate thru' a foreach statement.
 * There are 2 ways to create String: using literal and using new operator.
 * Strings are immutable. Once created U cannot modify them. It has methods like compare, concat, equals, split, length, replace compareTo, intern, substring and many more which can explore on how to manipulate the String object. It internally implements Serializable, Comparable interfaces. It also implements an interface CharSequence. The CharSequence interface is used to represent a sequence of characters. String, StrinBuffer and StringBuilder are based on this interface. 
 * When U reassign a string object, a new instance of the String is created and is assigned with it. The old string gets destroyed thru' Garbage collector. For mutable strings, U should use StringBuilder or StringBuffer. 
 * To create a string with multiple variables of different data types, U should String.format which works similar to sprintf of C. In this case U use the formatting place holders which internally convert the variables to a string data and make a String object to be usable. 
 * If U want to get a part of the String from an existing string, U could use substring. 
 * TODO: Explore other methods of the String class from the Oracle website Java Documentation. 
 *  StringBuilder is a class that allows to create Mutable strings. They can be changed without creating new objects. It is more performance oriented compared to other string classes. It uses the same object and performs the operations, so no GC will be involved and memory is not modified and hence the app will be faster. StringBuilder is prefered over string if U intend to modify the data.
 *  StringBuffer is very similar to StringBuilder, except that it is thread safe. It allows multiple threads to access it simultaneously without any locks. Due to this, it is less optimized than the StringBuilder 
 *  Conclusion: Objects of String are immutable, whereas objects of StringBuilder and StringBuffer are mutable.
 *  StringBuffer is thread safe, u can use the same object across multiple threads without getting the data corrupted, but has effect on performance 
 *  StringBuilder is the most optimized way of working with strings.
 *  If U have a string that is not modified, use String.
 *  Expected to modify in a Single threaded App: StringBuilder
 *  Expected to modify in a multi threaded App: StringBuffer. 
 *   
 *   * */
public class StringOperations {

	private static void StringExample() {
		//String charArray = new String(new char[] {'A','p','p','l','e'});//String using new operator
		//System.out.println(charArray);
		
		//String str = "Apple123";//Creating a String using literal
		//for(char c : str.toCharArray()) System.out.println(c);
		//System.out.println(str.substring(5));//startIndex will be included and endIndex is excluded. If U dont give endIndex, U will get the rest of the string as the value. 
		
		//U use concat method to combine a string with new data. It works similar to + operator so its not a good practice if U R using concat frequently. 
		//String fruit = "apple";
		//fruit = fruit.concat("123");//
		//System.out.println(fruit);//apple123
		
		//If U want to find a character or a character sequence, then U could use contains method of the String...
		//if(fruit.contains("apple")) System.out.println("Healthy fruit");
		
		//join method is used to combine one or more strings with a delimiter.
		//String joinExample = String.join("/","22","02","1977"); 
		//System.out.println(joinExample);
	}
	public static void main(String[] args) {
		//StringExample();
		//stringBuilderExample();
	}
	private static void stringBuilderExample() {
		////////String builder example///////////////////
		StringBuilder sb = new StringBuilder("Welcome to ");
		System.out.println(sb.hashCode());
		sb.append("CDAC e-DAC Course");//adds the new string to the end of the existing string...
		sb.insert(16, " Mumbai for ");//inserts the given string from a given index position. 
		//TODO: Try using replace method to replace a content of the string from another from a specific index to an end index.
		System.out.println(sb.reverse());
		System.out.println(sb.hashCode());
	}
}
