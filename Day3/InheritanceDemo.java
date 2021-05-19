/*
 * TODO: Principles of OOP using SOLID Principles. 
 * All the OOP features are based on SOLID Principles of OOP.
 * S: Single Responsibility principle: Layered Architecture. 
 * O: Open Closed Principle: Inheritance feature is because of this. 
 * L: Luskov's Substitution Principle: Runtime Polymorphism
 * I: Interface Segregation Principle: Dividing UR code into concrete interfaces. 
 * D: Dependency Inversion Principle: UR functions should return abstract objects rather than concrete objects.
 *  
 * Open Closed Principle states that a Class is closed for modification but is open for Extension.
 * A class functions can be extended to the other classes in OOP. The Class that is being extended is called BASE(Parent, Super) Class and the Class that is extending is called DERIVED(Child, Sub) Class 
 * Java supports Single Inheritance. UR class can have only one base class at a given level. However Java supports multi level inheritance where a class can be extended to another and that to another and so forth.. 
 **/
//Developed by Phaniraj
class BaseClass{
	public void testFunc() { System.out.println("Test Program"); }	
}//class is immutable. U shouldn't change the class.  

//Developed by Mahesh
class DerivedClass extends BaseClass {
	public void newFunc() { System.out.println("New Functionality"); }
}
	
class InheritanceDemo{
	public static void main(String[] args) {
		DerivedClass obj = new DerivedClass();
		obj.testFunc();//old function available in the base class
		obj.newFunc();//new function available in the derived class. 
	}
}
