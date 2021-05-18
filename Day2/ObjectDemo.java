//ObjectDemo.java
/*
All data types in Java are derived from a class called java.lang.Object. Everything is object in Java. 
It offers a set of operations and features that makes it available for all kind of data types including custom types.  
It helps in Converting reference types to String, get Type information, get HashCode information and many other common operations.
If U R creating a method whose return type is not known to U while coding, then U could set the return type as Object. All objects(Instances) in Java are implicitly Objects. Every data type can be implicitly convertd to Object. This is called as BOXING. Again every BOXED object could be converted back to its type using casting. This is called as UNBOXING.  
*/

class ObjectDemo {
	public static void main(String[] args) {
		//boxingExample();
		//equalsOperation();
		classInfoDemo();
	}

	static void classInfoDemo(){
		Object data  = 123;
		//Know the data type....
		Class details = data.getClass();
		System.out.println("The Data type of this object is " + details.getName());
	}

	static void equalsOperation(){
		int v1 = 123;
		int v2 = 123;
		System.out.println(v1 == v2);

		Employee emp = new Employee(123, "Phaniraj");//creating an object(variable allocated with a memory) in Java...
		Employee emp2 = emp;//new Employee(123, "Phaniraj");
		System.out.println("HashCode: " + emp.hashCode());
		System.out.println("HashCode: " + emp2.hashCode());
		System.out.println(emp == emp2);		
	}

	static void boxingExample(){
		Object data  = 123;//This is boxing. int is stored as Object. In this case, the data is of the type Object but it can store any kind of data in it....
		
		int temp = (int)data; //This is UNBOXING. UNBOXING is explicit..
		temp++;
	}
}

class Employee{
	int empId;
	String empName;

	public Employee(int id,String name){
		this.empId = id;
		this.empName = name;
	}
	//U should override the equals methods(later)...
}