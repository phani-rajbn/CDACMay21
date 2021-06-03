//FunctionalInterface.java
//There are different kinds of interfaces in Java: Normal interfaces, Functional interfaces, 
//Normal interfaces are those which have typically public, abstract methods in them. U dont have to use the keywords public and abstract to it. 
//Functional Interfaces: In this case, this interface has only one method in it. The purpose is to create methods on the fly to be implemented in ur program. 
//Tagged interfacs or Marker interfaces which have no methods at all in them, but JVM will add some features to it when a class is implementing it. (serializable interface)
//For interfaces with only one method in them, the purpose is to create method implementation without a need of an exclusive class, it could be done usin anonymous method or a lambda expression. We call such interfaces are functional interfaces. 
//However from Java 8, U could implement some methods with a prefix called default 

@FunctionalInterface
interface MathOperation{
	double mathFunc(double v1, double v2);
}

//A class is designed to have both data and operations to manipulate the data.
class AddOperation implements MathOperation{
	public double mathFunc(double v1, double v2){
		return v1 + v2;
	}
}

class FunctionalInterfaceDemo{
	public static void main(String[] args) {
		 MathOperation op = new AddOperation();
		 double res =op.mathFunc(123,23);		
		 System.out.println(res);

		MathOperation addFunc = (double v1, double v2) -> v1 + v2; //Lambda Expression...
		double res = addFunc.mathFunc(123.4,23.4);
		System.out.println(res);

	}
}

