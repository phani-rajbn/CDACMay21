//StatementsDemo.java
//if...else..if
//switch case..
//For loop
//while loop
//do..while loop
class StatementsDemo{
	public static void main(String[] args) {
		String cityName ="New Delhi";//Take input from the user... 
		if(cityName ==	"Bangalore")
			System.out.println("Garden City");
		else if(cityName == "Mumbai")
			System.out.println("Fashion City");
		else if(cityName == "New Delhi")
			System.out.println("Capital City");

		//Use switch case if U have more than 3 different conditions to check....
		//It will execute a block from multiple conditions. Unlike C++, U could use strings as condition in Java since J-7.
		//U can include default condition if none of the conditions statisfy and want to give a std operation. Use a jump statement for every case within the switch block. break, return statements to be used. However it is optional. If no break is found, it simply moves to the next case.
		switch (cityName) {
			case "Bangalore":
				System.out.println("Silicon city");
				break;
			case "Mumbai":
				System.out.println("Commercial Capitol");
				break;
			case "New Delhi":
				System.out.println("National Capitol");
				//break;//break is optional, but will fall thru' if U dont use it. 
			default:
				System.out.println("Unknown details");
		 }	 
	}
}
/*
if condition will check for the boolean evaluation and then determines the code execution. On true it enters the block, else it moves to the next statement outside the block.
*/