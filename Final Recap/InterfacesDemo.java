//method overriding, abstract classes and implementing abstract classes.
//All interfaces are abstract classes. But all Abstract classs are not interfaces.....
//All the methods of the interface are public and abstract.
import java.util.*;

class Employee{
	int empId;
	String name;
	String address;

	Employee(int id, String name, String address){
		empId = id;
		this.name =name;
		this.address = address;
	}
}
interface DataAccess{
	void addRecord(int id, String name, String address);
	void updateRecord(int id, String name, String address);
	void deleteRecord(int id);
	Object getAllRecords();
}

class EmployeeDataAccess implements DataAccess{
	private List<Employee> data = new ArrayList<Employee>();//data is hidden
	
	void addRecord(int id, String name, String address){
		Employee emp = new Employee(id, name, address);
		data.add(emp);
	}	
}
class InterfacesDemo{
	public static void main(String[] args) {
		
	}
}