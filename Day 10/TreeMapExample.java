import java.util.TreeMap;


/*
 * A TreeMap is used to implement Map interface and NavigatbleMap interface. It works similar to HashMap but will have sorting done in the order of the keys in the collection
 * */
public class TreeMapExample {

	//While creating Generic objects, UR type should be a reference type. So for all primitive data types U should its wrapper class as the argument. 
	static TreeMap<Integer, String> values = new TreeMap<Integer, String>();
	public static void main(String[] args) {
		values.put(5, "Suresh");
		values.put(2, "Gopal");
		values.put(6, "Rajesh");
		values.put(8, "Rahul");
		values.put(3, "Sumanth");
		
		//Feature wise TreeMap gives sorted data, but internally it takes a lot of effort to make it sort. So performance wise it is slower. 
		
		//To remove, U could use remove, iterate using Iterator or using keys or using Lambda Expression....
		
		System.out.println(values);
		values.forEach((k, v) -> System.out.println(k));
	}
}

/*
 * TODO:
 * Create an App that takes inputs from the User that generates Username and Password
 * It should have Functions: SignIn(Login) and SignUp(Register).
 * It should also allow user to signoff(remove) at any point of time.   
 * */
