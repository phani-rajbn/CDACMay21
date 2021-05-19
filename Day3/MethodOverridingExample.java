/*
 * When U have a base and a derived class, it is possible to create an object of the base class and instantiate it to the derived class. This is based on Liskov's Substitution principle. In this case, the members of the base class can be accessed thru' the object.
 *  Modifying a class can be done in 2 ways: Add a new feature or modify an existing feature. An Existing function can redefined to suit the new requirement of UR application. In this case, U would redefine the function in the derived class without altering the signature of function. This is called Method OVERRIDING.   
 * */

class FatherBusiness{
	void MakePayment(String mode, int amount) {
		if((mode == "Cash") || (mode == "Cheque"))
			System.out.println(String.format("An Amount of Rs. %d is payed in the form of %s", amount, mode));
		else
			System.out.println("Invalid mode of payment, so not accepted");
	}
}

class SonBusiness extends FatherBusiness{
	//Method overriding is  redefining the base class method in the derived to suit the new or modified requirement of the Application. 
	void MakePayment(String mode, int amount) {
		if((mode == "Cash") || (mode == "Card"))
			System.out.println(String.format("An Amount of Rs. %d is payed in the form of %s", amount, mode));
		else
			System.out.println("Invalid mode of payment, so not accepted");
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		FatherBusiness customer = new FatherBusiness() ;
		customer.MakePayment("Cheque", 50000);
		
		
		//A base type object could be instantiated to any of its derived classes..
		customer = new SonBusiness() ;
		customer.MakePayment("Card", 45000);
		//Polymorphism is a feature of OOP where an object and its method could behave in different way based on a different conditions. 
		
	}

}
