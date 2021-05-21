import java.util.*;

public class MyConsole {
    private static Scanner sn = new Scanner(System.in);
    
    public static String getString(String question) {
    	System.out.println(question);
    	return sn.nextLine();
    }
    
    
    public static int getNumber(String question) {
    	System.out.println(question);
    	return sn.nextInt();
    }
    
    

}
