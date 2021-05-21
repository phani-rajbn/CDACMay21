
public class Practise {
	//create a function that takes an array as arg and it should return the sum of the elements in the array. Call the function in main. 
	 int getSum(int [] values){
		int sum = 0;
		for(int num : values) sum += num;
		return sum;
	}
	
	public static void main(String[] args) {
	   	Practise  p = new Practise();
		int res = p.getSum(new int[] {1,2,3,4});
	   	System.out.println(res);
	}
}

