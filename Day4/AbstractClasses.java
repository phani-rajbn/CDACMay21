//Abstract classes:
//Abstract classes is a feature in OOP where a class can have one or more methods which are not implemented, but needs to be implemented by its sub classes. When there is no clarity on how its implemented but is required for the application, then U can make such methods as abstract methods and the classes that contain one or more abstract methods will be called as Abstract Classes. 
//abstract classes cannot be instantiated as there are unimplemented methods and UR class is incomplete. However U could extend the class into another, implement those abstract methods in them and thru' RTP, U can call the implemented methods as well as sub class methods.  
//If a class is derived from an abstract class, it must implement all the abstract methods, else even this class should be declared as abstract.
//U cannot inherit from 2 abstract classes as Java does not support multiple inheritance. 
//Implementing abstract is like overriding only, except in this case the base class has no implementation. 


//abstract class Test{
//	void testExample() {
//		System.out.println("test Example implemented");
//	}
//	public abstract void testFunc();//has no body..
//}

//
//class SubTest extends Test{
//	public void testFunc() {
//		System.out.println("test func is implemented in the subclass");
//	}
//}

abstract class Account{
	int accNo;
	String name;
	int balance;
	
	public void credit(int amount) { balance += amount ;}
	
	public void debit(int amount) { balance -= amount ;}
	
	public abstract void CalculateInterest();
}

//derived class of an abstract class must implement all the abstract methods of the base class. else even this class should be marked as abstract...
class SBAccount extends Account{
	public void CalculateInterest() {
		int p = this.balance;
		double rate = 6.5/100;
		double term = 0.25;
		double interest = p * rate * term;
		balance += (int)interest;
	}
}

class FDAccount extends Account{
	public void CalculateInterest() {
		//ToDo: implement this function of calculating interest thro CI into this account
	}
}

class RDAccount extends Account{
	public void CalculateInterest() {
		//ToDo: Implement this function of calculating interest for RD..
	}
}



public class AbstractClasses {
	public static void main(String[] args) {
		String input = MyConsole.getString("Enter the type of accout: SB, RD or FD");
		Account acc = null;
		switch(input) {
		case "SB":
			acc = new SBAccount();
			break;
		case "RD":
			acc = new RDAccount();
			break;
		case "FD":
			acc = new FDAccount();
			break;
		}
		acc.accNo = 111;
		acc.balance =65000;
		acc.name ="Phaniraj";
		acc.credit(5000);
		acc.CalculateInterest();
		System.out.println( "The balance: " + acc.balance);
	}
}
