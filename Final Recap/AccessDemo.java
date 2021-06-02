//ENCAPSULATION
//Abstraction is more like a method of hiding unwanted information. 
class test{
	protected void testFunc(){
		System.out.println("testFunc");
	}
}


class AccessDemoInterface extends test {
	//At Class level(public or nothing(default)) and inside the class
	//public makes the class available across multiple packages within the application. 
	//default makes the class available only within the package of the application. 
	//package is more like a conceptual unit that contain multiple classes in it. It is created to group ur classes and do avoid naming conflicts. Similar to namespaces in C++.
	//Within the class, UR members of the class could provide encapsulation at 4 levels:
	/*
	public: available anywhere
	private: available within the class(Helper functions)
	protected: available within the class and its derived classes upto any level, even across packages. 
	default : available anywhere within the package. 
	*/
	public static void main(String[] args) {
		//What is access specifier? A way of providing hiding feature in a class.
		test t = new test();
		t.testFunc(); //is not accessible thru
	}
}

//finalize was protected method: We should not allow others to call this. But we could allow our children to modify it if required. finalize is called by the GC.  
