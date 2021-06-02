/*
Arrays: It is an object that contain a group of similar elements in it. It is a simpliest form of collection. U can only store fixed number of elements  in it. At the time of declaration itself U should have mentioned the size of the array directly or indirectly.  
Arrays are internally objects of a class called Array, so with this U get methods and members to get info about the array after it is created. U can even store objects inside an array.
Index of an Array starts with 0 and cannot be modified like VB. 
Single dimensional, multi dimensional and Jagged Arrays. 

Advantages: The fastest way of storing different data into a single unit It is highly optimized when U want to retrieve or sort the data efficiently. Using the index position, U could get access to any element in the array without any effort. 

Issues: It has a fixed size and if need to do a lot of effort in coding to create dynamic arrays. For this, we use Collections framework. 

Syntax:
datatype [] identifier = new datatype[size];::size is an integer.
datatype [] identifier = { values for the array seperated by ,};   
datatype indentifier []  = new datatype[size];
PS: [] is the way to tell Java that it is an array. 
Use a length property to get the no of elements in the array. If U R able to get the size, use it instead of length. 
TIP: To take input from the user in Console, use a ready to use function called System.console().readLine().

Multi Dimensional Array
Jagged Array: Array of Arrays is called as Jagged Array. A School is an array of classes where each class has an array of students in it. 

How to create an array dynamically and take inputs from the user and display the data. 
*/

class Arrays {
	public static void main(String[] args){

		String data [] = new String[5];
		System.out.println(data.super.getClass().getName());
		System.out.println("Enter the no of Elements U want to create:");
		int size = Integer.parseInt(System.console().readLine());//Convert a String to a integer.
		int [] elements = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number to store in position " + i);
			elements[i] = Integer.parseInt(System.console().readLine());//Take input from the user to add the values to the elements of the array..
		}
		//foreach statement to loop thru' an array and access each element in it without going out of bounds(getting off the array) foreach is forward only and read only. 
		for(int val : elements) 
			System.out.println(val);
	}
}