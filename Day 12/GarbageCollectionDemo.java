/*
 * In C/C++, programmers are responsible for creating(new) and removing(delete) the objects from the memory after their use. Sometimes, u might forget to release the memory and eventually leading memory leaks. If too many such objects are created and U don't delete them, it ends up in memory shortage for the new objects creation and will terminate the program abnormally causing OutOfMemory Exceptions.
 * But in Java, U don't need to care for all those kind of objects that are no longer required. Internally in the JVM, there exists a component called GC that will destroy unused objects as and when its required if not frequently. Its main purpose is to free the heap area by destroying or freeing the Unused objects. These kind of objects are also called as Unreachable object. 
 * An object is said to be unreachable if it does not contain any reference of an object to it. Any object that is unreachable is said to be eligible for Garbage Collection. 
 * An object becomes unreachable or eligible for GC when U do any of the following things:
 * Nullify an object.(remember Array example of deleting an object). 
 * Resign the reference variable(remember string being assigned with = operator or += operator).
 * Object creation within a method(Local scoped objects are not reachable after the method is completed). 
 * Island of Isolation: Object1 references Object2 and Object2 references Object1. Both 1 and 2 are not referenced by any other object. This is called Island of Isolation. It is a acronym for a group of objects which reference each other, but they are not referenced any other object or other part of the application. 
 * GC will keep a watch of memory and the list called Finalization Queue that contain all unreachable objects. When the GC finds that there is a shortage of memory, it will be invoked internally as a parallel operation(Thread) and delete all the unreachable objects. We can notice that when U override the finalize method which is internally called when an object is destroyed. Java does not support traditional destructor, but UR finalize is designed in that way only. 
 * In Java U cannot explicitly call finalize method as its internal to the object and the JVM.  
 * U can however call the GC functions to destroy or free the unused objects using code. 
 * System class has gc object that requests the JVM to run the GC.
 * */

class SampleClass{
	String name;
	
	public SampleClass(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(String.format("Fruit by name %s is deleted", name));
	}
	//In java there is a function which U can implement called as finalize that will be called when the object is destroyed. 
	
}
public class GarbageCollectionDemo {
	
	private static void largeObjectCreation() throws InterruptedException {
		for(int i= 0; i < 20; i++) {
			SampleClass cls = new SampleClass("Apple " + i);
			System.out.println(cls.hashCode());
			Thread.sleep(100);//Will make a delay of 1 sec in ur code
			System.gc();//It will request the JVM to release any eligible objects.
			//Runtime.getRuntime().gc();//This is another way of calling the Garbage Collection, PS: System.gc will internally call Runtime.getRuntime.gc.
		}	
	}
	public static void main(String[] args) throws Exception {
		largeObjectCreation();
		Thread.sleep(5000);
		System.gc();
	}

}
/*
 * Calling the gc method is a request, not a command, JVM might still take its own time to invoke the GC. 
 * Whenever an object is deleted, GC will call the finalize method of the object. This can be used to perform any cleanup activities for the object. 
 * Once the finalization is completed, then the object is destroyed. finalize is defined in Object class and is protected member. It cannot be called explicitly.
 * Garbage Collector calls the finalize method, not the JVM, although GC is a part of JVM.
 * A finalize method is invoked once and only once for any given object. 
 * Finalize method throws a throwable object, if any uncaught exception is thrown in the finalize method, the exception is ignored and the finalization of that object terminates.  
 * */
















