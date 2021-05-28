import java.util.*;

//List->Vector and Stack are the 2 classes that can be used with List. stack is designed on data structure based on the principle of last in first out. It contains 2 functions called push and pop.
//Push method is used to add the data on the top of the Collection. Most of the other collections will add new element to the bottom, but Stack adds the element to the top. U can pop out that element(first) and cannot do that in b/w. 


public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			myStack.push(i + 1);
		}
		
		//myStack.forEach((i)->System.out.println(i));
		///////////POPING ELEMENTS////////
		//pop method removes the lastly added element from the stack and returns it. 
		for (int i = 0; i < myStack.size(); i++) {
			Integer pullOutGuy = myStack.pop();
			System.out.println(pullOutGuy);
		}
		
		//peek will give the last element added to the stack but will not remove it. 
		System.out.println(myStack.peek());
		//FOR READING THE ELEMENTS:
		//System.out.println(myStack);
		
		for (int i = 0; i < myStack.size(); i++) {
			System.out.println(myStack.get(i));
		}
	}
}
