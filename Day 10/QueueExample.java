import java.util.*;

//Requirement: 1st In 1st Out. U cannot add, remove anything in b/w.

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> items = new LinkedList<String>();
		items.add("Apple");
		items.add("Mango");
		items.add("Orange");
		items.add("Banana");
		items.add("Kiwi");
	    items.offer("Sumpra");//Similar to add but will push the size without giving exception when U have defined the capacity
	    
		if(items.size() == 5)
			items.remove();//It removes the first object(head) in the queue. 
		System.out.println(items);
		
		items.forEach((i)->System.out.println(i));
	}

}
