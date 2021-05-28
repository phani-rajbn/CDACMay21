import java.util.*;
import java.io.*;//package that contains all the classes required for IO operations in UR java application. 

/*
 * Java IO is used to perform Input and output operations on storage devices like files, memory, Inter process Apps
 * It uses streams to perform the IO operations. Anything that comes into the app is called as Input Stream and anything that goes out of the App is called as Output Stream. 
 * Stream in a Programming language is a sequence of data that flows from one end(Source) to another end(Destination). 
 * Streams comprise of bytes. Everything in a stream will be converted as bytes only, there by making the reading and writing operation common. The logic of reading a binary or an image or a text would be similar. However for reading large Binary files(BLOB) we need ensure the memory management also with it.
 * Java gives basically 3 Streams: System.out(Output), System.in(Input) and System.err(Error Display).
 * in and out are std input and the output streams while the err is the error stream used to raise or handle errors within the app. 
 * Most of the streams are derived from 2 abstract classes: InputStream and OutputStream. Whenever a stream object is created, it must be opened, work with it and finally closed. Any kind of stream object that is opened must be closed. 
 * InputStream->FileInputStream, BufferedInputStream, ObjectInputStream, DataInputStream
 * OutputStreams->FileOutputStream, BufferedOutputStream, ObjectOutputStream, DataOutputStream   
 * */
//ToDo: Create a class called Employee, create a function called GetAllEmployees, in it, fill each row of the CSV file into an Employee object and add it to the List collection, finally return the list. Call this function in the Main program and display Names and Address of each employee...  

class EmpData{
	int empId;
	String empName;
	String empAddress;
	int empSalary;
	int deptId;
	
	public EmpData(int id, String name, String address, int salary, int dept) {
		this.empId = id;
		this.empName = name;
		this.empAddress = address;
		this.empSalary = salary;
		this.deptId =dept;
	}
}

public class FileIODemo {

	static List<EmpData> GetAllEmployees(String filename)throws Exception{
		throw new Exception("Do it URSelf");
	}
	public static void readNamesFromFile(String filename) {
		
		FileReader reader;
		try {
			reader = new FileReader(filename);
			BufferedReader buffReader = new BufferedReader(reader);
			String line = "";
			while((line = buffReader.readLine()) != null) {//Reader should read each line at a time. 
				//Split the line into array of words based on Comma
				String [] words = line.split(",");
				System.out.println(words[1]);//Index starts with 0
			}
			buffReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Display the 2nd element of each array 
	}
	public static void readFile(String filename) {
		FileReader reader;
		try {
			reader = new FileReader(filename);
			int cursor = 0;
			while((cursor = reader.read()) != -1) {
				System.out.print((char)cursor);
			}
			reader.close();//Close it after use....
		}catch(FileNotFoundException fEx) {
			System.err.println(fEx.getMessage());
		}catch(IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
	public static void main(String[] args)  throws Exception{
		//basicIOOperations();
		//File Reading Example:
		
		//String fileName = "C:\\Users\\aksha\\eclipse-workspace\\SampleConApp\\src\\FileIODemo.java";
		//readFile(fileName);
		
		String fileName = "C:\\Users\\aksha\\eclipse-workspace\\SampleConApp\\EmpList.csv";
		//readNamesFromFile(fileName);
		
		
		fileWritingOperation();
		List<EmpData> data = GetAllEmployees(fileName);
		for(EmpData emp : data)
			System.out.println(emp.empName);
	}

	
	//Modify this function to take inputs from the user...
	private static void fileWritingOperation() {
		EmpData dt = new EmpData(111, "Phaniraj", "Bangalore", 65000, 3);
		try {
			FileWriter writer = new FileWriter("MyEmpData.csv", true);
			String line = String.format("%d,%s,%s,%d,%d", dt.empId, dt.empName, dt.empAddress,dt.empSalary, dt.deptId);
			writer.write(line + "\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void basicIOOperations() {
		System.out.println("Simple message on the std ouput device(Console)");
		System.err.println("OOPs! Something wrong happened!!!!!");
		try {
		int asciiVal = System.in.read();
		System.out.println(String.format("The Ascii Value: %d\tThe char value: %s", asciiVal, (char)asciiVal));
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
