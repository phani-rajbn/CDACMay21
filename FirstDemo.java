import java.io.console;//We are telling the system that we wish to use this class called console

class FirstDemo{
	public static void main(String [] args){
		//System.out.println("Testing Java App outside Eclipse");
		System.out.println("Enter the Name");
		String name = System.console().readLine();
		System.out.println("Name entered is " + name);
		System.console().printf("The name entered is %s\n", name);
	}
}
//Files are saved as .java files
//After the JDK is installed, U should set the environment variable PATH to the bin dir of the JDK. 
//When U compile the .java file, for every class that U have created, it creates to U a .class file. The .class file is a intermediate file that will contain metadata and info about the class along code converted to platform independent format. 
//console class works only on Command Prompt. it does not work on Eclipse's Console. If U want to use it on Eclipse, U should use Scanner. 
//Console class has methods to read the text from the Console and return as string. If U want to convert to any other kind of data, U should do it explicitly using converters. 
//For text editors other than notepad, U can use notepad++ or Sublime Text.
