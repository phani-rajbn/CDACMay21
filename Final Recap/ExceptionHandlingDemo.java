//ExceptionHandlingDemo
//Exception is an unexpected termination of UR program when it encounters unacceptable situation. 
//As a programmer, U should avoid those abnormal termination. Try to avoid writing such kind of code. However we expect to handle such exceptions accordingly as per Ur requirements. 
//Java provides 3 keywords to handle: try...catch...finally. It is used to handle runtime exceptions. U write the try..catch blocks anywhere within a function if U expect a code statement would raise an Exception. It is good practice to handle the exceptions at the  points where the exeption could be raised, instead of handling it at the top level(main fn). 
//try block will contain the code that would work formally and could anticipate an exception. 
//When exception is raised, it will be thrown to the application by the JVM in the form of objects of a class derived from Throwable. Programmers will catch that exception under catch block. for a given try block, U can have any no of catch blocks. Each catch block will have a catch keyword followed by (ExceptionClassName) and an optional instance variable of it. 
//throw keyword is used to raise an exception in UR code. throw must be followed by the instance of the Throwable derived class. 
//If the thrown exception is not caught within its code block, then the function must have a declaration with 'throws' keyword followed by the className of the Exception that UR code throws. 

//Custom Exception is a class that U create to raise exceptions related to UR Application logic. 

class InvalidRateException extends Exception{
	public InvalidRateException(){

	}

	public InvalidRateException(String msg){
		super(msg);
	}
}

class ExceptionHandlingDemo {
	public static void main(String[] args){
		boolean onWrong = false;
		do{
			System.out.println("Enter a number from 1 to 10");
			try{
				int value = Integer.parseInt(System.console().readLine());
				if((value < 1) || (value > 11)){
					//UR program must reject the value...
				 	throw new InvalidRateException("Value should be within 1 and 10");
				}
				System.out.println("UR Rating: " + value);
				onWrong = false;
			}catch(NumberFormatException ex){
				System.out.println("input is not a valid number or is not in the range\nPlease try again");
				onWrong = true;	
			}catch(InvalidRateException genEx){
				System.out.println(genEx.getMessage());
				onWrong = true;
			}
		}while(onWrong);
	}
}