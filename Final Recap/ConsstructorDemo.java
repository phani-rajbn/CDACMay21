class Test{
	String name;
	//construct the object so that we can use the object without an explicit call any function.	
	Test(){
		name = "Valid Name";
	}

	Test(String name){
		this.name = name;
	}
}

class Apple{
	Apple(String color){
		System.out.println("Base Apple with color: " + color);
	}
	Apple(){
		System.out.println("Base Apple");
	}
}

class KashmirApple extends Apple{
	KashmirApple(){
		super("red");
		System.out.println("Kashmir Apple");
	}
}

class ConsstructorDemo{
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.name);

		//Create the instance and check the output......
	}
}
/*
Constructor is like method with no return type. It has the same name as the classname. 
Constructors can have arguments. Constructor with no args is called default constructor and with args are called Parameterized constructor. 
If UR class is inherited, then UR base class default constructor will be called before UR constructor is called. If U want a specific paramterized constructor of the base to be called, then U should do so by calling it urself using super(). super should the first line in ur constructor. 

*/



