import java.util.Arrays;

//Deep copy vs. Shallow copy:
//How copying works for primitive types(Will deep copying make sense here?)
//How it works for reference types
class Sample{
	int [] elements;
	
	public Sample(int [] elements) {
		//this.elements = elements;//The data will be same and it simply copies the object, share the same memory. So anything that
		//is modified will be refered by the same object. This is called as Shallow copy..
		
		this.elements = new int[elements.length];//New object and copy the elements one by one...
		for (int i = 0; i < elements.length; i++) {
			this.elements[i] = elements[i];
		}
	}
	
	public void showData() {
		System.out.println(Arrays.toString(elements));
	}
}
public class DeepAndShallowCopyDemo {
	public static void main(String[] args) {
		int [] values = {2,3,4};
		Sample ex = new Sample(values);
		values[1] = 34;//Will be modified if deep copied...
		ex.showData();
		
		System.out.println("Outer array");
		for(int val : values) System.out.println(val);
	}
}