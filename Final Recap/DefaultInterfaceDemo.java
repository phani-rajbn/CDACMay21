//Prior to JDK 8, interfaces could not define implementation. But now, we can provide default implementations for interface methods.
//The purpose of the default methods in an interface is not to remove the purpose of the interface. It is provided to be applied on existing interfacs without breaking the old code. 

interface Simple{
	void Example();
	default void simple(){
		System.out.println("Simple Func");
	}
}

class SimpleExample implements Simple{
	public void Example(){
		System.out.println("Example Func");
	}
}

class DefaultInterfaceDemo{
	public static void main(String[] args) {
		Simple intObj = new SimpleExample();
		intObj.Example();		
		intObj.simple();
	}	
}