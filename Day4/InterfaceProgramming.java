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

//Agenda: 
//Functional interfaces in Java. 
//Constructors and destructors. 
//Exception Handling. 
