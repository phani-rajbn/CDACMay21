/*
	Arrays are group of similar variables to be represented as one unit. With this, U can create one variable and access the internal elements of the array using [] operator. With arrays, U can perform a common operation on all its members with a simple looping logic.  
	Arrays are fixed in size, they are immutable. Once U create the array, U cannot resize them. But in the real world U might need to add, remove and insert the data as per UR business needs which makes arrays unusable. 
	However, Arrays are optimized and fast. Only thing is U should be aware of the size and the type of the data that U R working with. 
	For such of data, Java offers Collections and Generic classes that can be used for data manipulations. 
*/

class ArraysExample{
	public static void main(String[] args) {
		//firstExample();
		//secondExample();
		//jaggedArrayExample();
	}
	//Write a program that take inputs from the user including the size and the values. Then display it on the Console output. 

	//Example for Jagged Array
	static void jaggedArrayExample(){
		//Array of arrays is called Jagged Array. In this case, U will have a fixed no of rows but variable no columns in each row.
		//A School is an array of classrooms where each room has an array of students in it.
		int[][] school = new int[4][];//4 rows in the array...
		school[0] = new int[] {89,56,55,45,78};
		school[1] = new int[] {45,56};
		school[2] = new int[] {55,23,14, 66, 89,56,55,45,78};
		school[3] = new int[] {45,56,67,88,76};//Each row will have different number of values...

		//Display as MATRIX Format.
		for(int i =0; i < school.length; i++){//Gives the rows....
			for(int x : school[i]){
				System.out.print(x + " ");
			}
			System.out.println();
		}		  
	}

	//Example for Multi-Dimensional Array....
	static void secondExample(){
		int[][] marks = {{45,56,65,66}, {56,86,48,26}, {88,96,97,91}};//3X4 arrray. It has 3 rows and 4 columns....

		//Display the array in matrix formats using nested for loops..
		for(int i = 0; i < 3; i++){//row looping.....

			for(int j =0; j < 4; j++){//column looping....
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}

	//Example for Single dimensional Array.....
	static void firstExample(){
		String [] fruits = new String[5];//syntax to create an array in Java.... 
		for(int i = 0; i < 5; i++){
			fruits[i] = IOClass.getString("Enter the Fruit Name");
		}
		System.out.println("All the fruits have been set");
		System.out.println("Displaying all fruits:");
		for (String fruit : fruits ) {
			System.out.println(fruit);
		}
	}
}