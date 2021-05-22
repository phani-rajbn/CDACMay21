/*
 * From Java8 onwards, we have a concept of interfaces with only one abstract method in them. We call such interfaces as functional interfaces. It will be helpful to implement these interfaces using lambda Expressions. However UR functional interfaces can have default methods(with implementation). 
 * When U wish to implement an interface, U need to explicitly create a class that implement this interface. A class does not make sense for only one method. So since J-8, U can implement a function within UR code without a new class creation. 
 * Java itself has interfaces like Runnable(Multi Threading), Comparable(Sorting) which have only method in them.  
 * */
@FunctionalInterface//Annotation is optional. This will make the interface not to accept additional methods..
interface ITest{
	void testFunc();
}

@FunctionalInterface
interface MathInterface{
	double mathFunc(double v1, double v2);
	
}

class Tester implements ITest{
	@Override
	public void testFunc() {
		// TODO Auto-generated method stub
		System.out.println("An Example");
	}
}


public class FunctionalInterfaces {

	public static void main(String[] args) {
		ITest javaTest = new Tester(); //Old format..... 
		javaTest.testFunc();
				
		////////////////New way of implementing interfaces with only one method.....
		ITest jspTst = () -> {
			System.out.println("testing multiple lines");
			System.out.println("JSP Test implemented");
		};
		
		jspTst.testFunc();
		
		///////////////////////MathInterface implemented/////////////////////////
		MathInterface addFunc = (double v1, double v2) -> v1 + v2;
		MathInterface subFunc = (double v1, double v2) -> v1 - v2;
		System.out.println("The added value is " + addFunc.mathFunc(123,23));
		System.out.println("The Subtracted value is " + subFunc.mathFunc(123,23));
	}
}
/*PTR:
 * A Functional interface will have only one abstract method but can have multiple default methods. 
 * @FunctionalInterface annotation is used to ensure that it cannot have more than one method in it. It is enforced in Eclipse only. 
 * This concept was introduced in J-8 and its practical uses are available when we use java.util package that has a lot of new functional interfaces: Predicate, Comparable, BitwiseOperator, Runnable interfaces where when we implement these interfaces U don't need to create an explicit class.
 * Before J-8, we used inner classes to achieve the same mechanism.  
 * */














