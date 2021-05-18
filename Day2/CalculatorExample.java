//CalculatorExample.java
//Write a program that performs arithematic operations in the application...
//Follow seperation of concerns. This is also called as MODULARITY..
//Programming Constructs of a Java Application...

//User Interface.....
class CalculatorExample {
	public static void main(String[] args) {
		boolean check = true;
		do{
			double value1 = IOClass.getDouble("Enter the First Value");
			double value2 = IOClass.getDouble("Enter the Second Value");
			String operand = IOClass.getString("Enter the Operation  as: + - * /");
			double result = getResult(value1, value2, operand);		
			System.out.println("The Result of this Operation is :" + result);
			check = IOClass.getBoolean("Do U want to try again? Please Y or N");
		}while(check);
	}

	static double getResult(double value1, double value2, String operand){
		double result = 0;//Good practice to create a variable with assigned value.
		//Possible inputs for Operand: +, -, * /
		switch(operand){
			case "+":
				result = value1 + value2;
				break;
			case "-":
				result = value1 - value2;
				break;
			case "*":
				result = value1 * value2;
				break;
			case "/":
				result = value1 / value2;
				break;
			default:
				result = 0;
				break;
		}
		return result;
	}
}

class IOClass{
   static String getString(String question){
   		System.out.println(question);
   		return System.console().readLine();
   }

   static double getDouble(String question){
   		System.out.println(question);
   		String answer = System.console().readLine();
   		return Double.parseDouble(answer);
   		//return Double.parseDouble(getString(question));
   	}

   	static boolean getBoolean(String question){
   		System.out.println(question);
   		String answer = System.console().readLine();
   		//return Boolean.parseBoolean(answer);
   		/*return answer.equals("Y"); //checks for true or false.*/
   		if(answer.equals("Y"))
   			return true;
   		else
   			return false;
   	}	//== does not work for Strings(Reference types)...
}