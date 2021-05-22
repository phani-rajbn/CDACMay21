//Constructors are Sp functions that are used to set values for the fields of the class so that the object that is created can be usable without additional functions to be called before we use it. 
//In java, all fields of a class will be initialized to their default values which is not the case in C++.
//If U want to set UR own set of values while the object is being created, then u should create Constructors to construct the object in the fashion that U want it to be created. 
//Constructors with parameters are called parameterized constructors and without parameters are called as DEFAULT Constructors. 

class Course{
	int courseId;
	String courseName;
	int courseDuration;
	String trainer;
	
	public Course(int id, String name, String trainer, int duration) {
		courseId = id;
		courseName = name;
		this.trainer = trainer;
		courseDuration = duration;
	}
	
}

public class Constructors {
	//access modifier returntype funcName(parameters)
	private static Course createCourse() {
		int id = MyConsole.getNumber("Enter the Course ID");
		String name = MyConsole.getString("Enter the Course Name");
		String trainer = MyConsole.getString("Enter the Trainer name");
		int duration = MyConsole.getNumber("Enter the Course duration");
		//This way of creating will be helpful if U are reading data from a file, database and populating to an object.
		Course cr = new Course(id, name, trainer, duration );
		return cr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
        //abstraction....
        Course cr = createCourse();
        System.out.println(cr.courseId);
	}

}
/*PTR:
 * Constructors are invoked when the object is created.
 * Name of the constructor should be same as the class name.
 * It will not have any return values, not even void, but internally it returns an object of that class. So we don't explicitly have any return types for constructors. 
 * constructors can be overloaded, parameterized constructors are those with parameters and default constructors are without any parameters. 
 * In inheritance scenario, the default constructor of the base class will be called implicitly when U create the object of the derived class. However, U must call the parameterized constructor explicitly using super.  
 * */










