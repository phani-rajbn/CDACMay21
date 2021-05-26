class Employee{
	int empId;
	String name;
	String address;
	int empSalary;
}


public interface DataRepository {
	void AddEmployee(Employee emp);
	void DeleteEmployee(int id);
	Employee[] Find(String name);
	Employee Find(int id);
	void UpdateEmployee(Employee emp);
}

//TODO: Implement the class using List<T> Functions and use it in a Menu Driven Application. 
class ListDataRepository implements DataRepository{

	@Override
	public void AddEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee[] Find(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee Find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
}
