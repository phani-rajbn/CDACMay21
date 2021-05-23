
//A Class that is created to raise Exceptions for UR business requirements are called as Custom Exceptions. They are created for UR application and for UR business requirement. A Custom Exception class extends Exception class of Java. 
//Some Architects prefer to implement some functionality in the Constructor like Logging exceptions to the Event log of the OS.

class EmployeeNotFoundException extends Exception{
	public EmployeeNotFoundException() {}
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) throws EmployeeNotFoundException {
		try {
			throw new EmployeeNotFoundException("Employee not found");
		}catch(EmployeeNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
	}
}
