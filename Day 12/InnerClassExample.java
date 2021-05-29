
//A nested class inside an interface or a class is called as inner class. It is used to develop a more readable and maintainable code as U logically group classes and interfaces in one place. Inner classes are implicitly available to the outer classes and will need less code to enforce this rule and making UR code more optimized. 
//If a class is useful to only one other class, then it is logical to place the class inside the calling class and use it. It keeps them together and is not intended to be used anywhere else. Nesting of these classes will make more streamlined in their packages. It also increases encapsulation. This is one way of Java' answer to Friend Classes in C++..
//Inner classes can be static. Since Java8, U need not create inner classes, instead use anonymous classes. Very helpful for creating classes for functional interfaces.
//4 types of inner classes: Nested classes, Method classes, Anonymous classes, static classes. 

class OuterClass{
	private void testMe() {
		System.out.println("testMe is intended to be used only within this class");
	}
	
	public void CallMyFunc() {
		InnerClass cls = new InnerClass();
		cls.doTests();
	}
	class InnerClass{
		void doTests() {
			testMe();//Calling a private method of an other class, but because it is a part of the same class, Java will allow to access it. 
		}
	}
	
}
public class InnerClassExample {

	public static void main(String[] args) {
		OuterClass cls = new OuterClass();
		cls.CallMyFunc();
	}

}
