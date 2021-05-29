import java.io.*;
/*Points:
 * Serialization is a feature of converting an object to a binary state which can be retrieved back from its state to be useable inside an app. In this case, the data of the object is not saved, but the object itself. Internally the object contain both metadata and data. The process of saving the object to a binary format is called Serialization and its reverse process is called Deserialization. 
 * We use ObjectOutputStream and ObjectInputStream to perform serialization and deserialization.  
 * Every serialization process has 3 steps:
 * What kind of object to serialize: An object of a class that implements an interface called Serializable could be used to serialize.  
 * Where to serialize: File, Memory, Serial ports, Sockets etc. 
 * Format of serialization: Binary, XML or SOAP.
 * Deserialization can happen on only those objects that are serialized. The Unboxing should be handled properly so that U could convert the object to the same type from which it was serialized. 
 * In serialization, either the object is serialized or nothing gets serialized. There is no scope of appending existing file or updating the file.
 * When working with collections, U can serialize all collection objects.
 * Examples: Storing the object instead of data will help in object security. It means if an object is stored as serialized object and someone tries to modify it, the deserialization wont work as the data will be corrupted.
 * In game Software, U will be storing the state of the game to start again from the same location.
 * In IPC, Network based Applications, the objects are shared in the network thru serialization objects only.     
 * */

//Serializable does not have any method, but UR class must implement the interface, however there is nothing to implement here. 

//TODO: use the collection Framework to implement a functionality to serialize all objects of it and retrieve it back to the original position. 
class Patient implements Serializable{
	int patientID;
	String name;
	long phoneNo;
	
	public Patient(int id, String name, long phoneNo) {
		patientID = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s , %d", patientID, name, phoneNo);
	}
}
public class SerializationExample {
	//ToDo: Take inputs from User and do the serialization..
	public static void main(String[] args) {
		//serializationDemo();
		//U cannot read the binary object directly, rather U should deserialize it back to the same type and then view it. 
		deserializationDemo();
	}

	private static void deserializationDemo() {
		try {
			FileInputStream fIn = new FileInputStream("Demo.ser");
			ObjectInputStream ois = new ObjectInputStream(fIn);
			Patient p = (Patient)ois.readObject();
			System.out.println(p);
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void serializationDemo() {
		//Use l for creating long literals.
		Patient p = new Patient(123, "Phaniraj", 9945205684l);//What to serialize...
		try {
			FileOutputStream fs = new FileOutputStream("Demo.ser");//Where to serialize.
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(p);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
