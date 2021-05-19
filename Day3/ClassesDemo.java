
public class ClassesDemo {
	public static void main(String [] args) {
	     Student student = new Student();//() is a must.
	     student.setDetails(123, "Phaniraj", "Juhu-Mumbai");
	     //Display the ID, Name and Location...
	     System.out.println("The ID is " + student.getId());
	     System.out.println("The Name is " + student.getName());
	     System.out.println("The Location is " + student.getLocation());s
	}
}

//Class will have data, functions, nested classes...
//Encapsulation(Data Hiding) is a feature of OOP which allows UR class hide members that U want to show to the users. However U create them for storing data, modularity reasons. 
class Student{
	//Data will usually private. It is hidden to others.
	private int id;
	private String name;
	private String location;
	
	//functions or methods are operations that can be performed by the object. These operations are created to either access the private members of the class or to manipulate them. 
	void setDetails(int id, String name, String location) {
		this.id = id;//this is an operator used within a class to refer its members...
		this.name = name;
		this.location = location;
	}
	
	int getId() { return id; }
	
	String getName() { return name; }
	
	String getLocation() { return location; }
	
	String getAllDetails() {
		return String.format("Name:%s, Location: %s, ID: %d", name, location, id);
	}
}

//ToDo: Create a Class called CDACCenter which has ID, Name, Location, Address, Coordinator. Develop an app that will take inputs from the user to create objects of Center and locations to be in Bangalore, Pune, Mumbai, Hyderabad, Chennai. U should create an Array of Center of size 5. U should allow the user to set the values to these Centers and then display the details on the Console.  












