
class MathClass{
	int first, second;
	String operand;
	String res;
	
	public MathClass(int first, int second, String operand) {
		this.first = first;
		this.second = second;
		this.operand = operand;
	}
}

public class ReferenceExample {

	static void PassObject(MathClass cls) {
		if(cls.operand.equals("+"))
			cls.res = Integer.toString(cls.first + cls.second);
		else if(cls.operand.equals("-"))
			cls.res = Integer.toString(cls.first - cls.second);
	}
	
	public static void main(String[] args) {
		MathClass obj = new MathClass(123, 23, "-");
		PassObject(obj);
		System.out.println("The result: " + obj.res);
	}

}
