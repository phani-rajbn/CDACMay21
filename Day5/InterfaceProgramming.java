//Interface is a type that will have only abstract methods in them. Unlike Abstract classes, U don't implement any method here. interface members are expected to be always public. All interfaces are abstract classes but all abstract classes are not interfaces.  
//The class that implements the interface will not have any of inheritance as the parent class has no implementation in it. 
//interface works like plan and implement pattern. every class can have its own implementation without affecting the other. 
//As interfaces are not inherited, U can implement multiple interfaces at the same level.
//Since Java 8, we have concept called Functional interfaces and default methods....
//Plan....
interface IParty{
	void InviteFriends(String [] names);
	void OrderCake(int size, String flavor);
	//New feature since Java-8. 
	default void OrderDrinks() {
		System.out.println("Soft Drinks are ordered");		
	}
}

//A class that implements the interface must provide public implementations for all the methods.
class Party implements IParty {

	@Override
	public void InviteFriends(String[] names) {
		for(String name : names)
			System.out.println("Sending whatsUp message to invite to " + name);
	}

	@Override
	public void OrderCake(int size, String flavor) {
		System.out.println("Ordered cake from Cakes and Slices of wieght " + size +" and of flavor " + flavor);		
	}
	
	public void Dance() {
		System.out.println("Dancing");
	}
	
}

class MyPersonalParty implements IParty{

	@Override
	public void InviteFriends(String[] names) {
		System.out.println("invited personally");
	}

	@Override
	public void OrderCake(int size, String flavor) {
		System.out.println("Orders veg cake");	
	}
	
}
public class InterfaceProgramming {

	public static void main(String[] args) {
		IParty party = new Party();
		party.InviteFriends(new String[] {"Phani","Gopal", "Banu","Kumar"});
		party.OrderCake(5, "Choclate");
	
		Party temp = (Party)party;
		temp.Dance();
		
		party = new MyPersonalParty();
		party.InviteFriends(new String[] {"Phani","Gopal", "Banu","Kumar"});
		party.OrderCake(5, "Vanilla");
	
	}

}
/*
 * Common b/w Abstract classes and Interfaces:
 * Hiding the internal implementation of a feature and only showing the functionality to the users is one of the purposes of abstraction. This is achieved using abstract classes and interfaces. 
 * What it does(Showing) and how it does(hiding). 
 * Both of them are used for abstraction purposes only. 
 * Differences b/w Abstract classes and interfaces:
 * Methods: Interfaces can have only abstract methods. An Abstract class can have abstract and non abstract methods in it. PS: From J-8, interfaces are allowed to have default and static methods in it. In this case, these methods are implemented in the interfaces itself. This feature is purely used for adding one or 2 features to an existing Application without breaking the application.
 * Interfaces are implemented using implements and Abstract classes are extended using extends. 
 * U can have multiple interface inheritance, abstract classes cannot have multiple inheritance.   
 * Interfaces in Java are public by default, abstract classes can have private, protected, default methods in it. 
 * interfaces can have fields that are default const(final), abstract classes can have non static, const, normal fields like any other class. 
 **/
//Agenda: 
//Functional interfaces in Java. 
//Constructors and destructors. 
//Exception Handling. 




















