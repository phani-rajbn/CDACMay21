/*
 * Method overloading is a feature of OOP popular as Compile time polymorphism.
 * In this case, if U have 2 or more methods that have similar functionalities but different args, then U can have same name for all those methods. While calling the method, based on the argument U have provided, the appropriate method gets invoked. In this case, the calling method is determined while U R passing the args to the function before u actually compile the program, hence it is called as Compile time polymorphism.
 * Args could be either by number, type or the order on which it is passed.
 * Return type does not matter, only change in the return type is not method overloading.   
*/
import java.util.*;
class Employee{
	int empId;
	String empName;
	
	void setDetails(int id, String name) {
		empId = id;
		empName = name;
	}
}

class EmployeeDb{
	//ToDo: Modify the code so that inputs are taken from the User instead of 10.
	private Employee [] employees = new Employee[5];//data of the class...
	
	public void setValues() {
		employees[0] = new Employee();
		employees[0].setDetails(111, "Phaniraj");
		
		employees[1] = new Employee();
		employees[1].setDetails(112, "Rahul");
		
		employees[2] = new Employee();
		employees[2].setDetails(113, "Arti");
		
		employees[3] = new Employee();
		employees[3].setDetails(114, "Aditya");
		
		employees[4] = new Employee();
		employees[4].setDetails(115, "Rajesh");
		
		
	}
	
	//foreach does not need to know the max no of elements, U don't have to increment any number, index value need not be evaluated. Easy for iterating purpose. foreach is forward only and read only. 
	public Employee FindEmp(int id) {
		for (Employee employee : employees) {
			if(employee.empId == id) {
				return employee;
			}
		}
		return null;//If no employee is found after iterating all the elements of the array...
	}
	
	public List<Employee> FindEmp(String name) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		for(Employee emp : employees) {//loop thro the array of elements...
			if(emp.empName.contains(name)) {//find the matching employee with the name..
				list.add(emp);//found emp should be stored into a temp list...
			}
		}
		return list;//after all the looping, U return the list....
	}
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		EmployeeDb db = new EmployeeDb();
		db.setValues();
		//While writing the code, U R aware of which form of the fn is to be invoked. So it is called as COMPILE TIME POLYMORPHISM...
		
		Employee emp  = db.FindEmp(111);
		System.out.println(emp.empName);
		
		List<Employee> foundEmployees = db.FindEmp("Arti");
		foundEmployees.forEach((eemp)->System.out.println(eemp.empName));
		}
}















