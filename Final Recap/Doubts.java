//every type in Java is a derived class of Object.
//If u assign a value to the object, it is implicit:
//BOXING is a terminology used when we assign any kind of data to Object. Object wrapps the internals of the data that U have assiged. 
//When U want to perform any operation on the boxed value, U must unbox it before U do the operation. This concept of recoverting the Object back to the data type of the data is called UNBOXING, which is done thru' typecast. 

class base{
	public void test(){
		System.out.println("test");
	}
}

class derived extends base{
	public void newTest(){
		System.out.println("test again");
	}
}

//Base Class is assigned with derived object: implicit
//Deried class when assigned with base: with casting..



class DoubtsClarification{
	public static void main(String[] args) {
		//Upcasting
		base obj = new derived();//This is internally base object. It is implicit...
		obj.test();//Will call the method....

		//Downcasting
		derived copy = (derived)obj;//convert base object to derived object. 
		copy.newTest();
		
		boxingAndUnboxing();

	}
	static void boxingAndUnboxing(){
		Object value = "Some Data";//BOXING. String has been contained into Object.
		//UNBOX it before U do any specific operation related to the value of the object...
		String copy = (String)value;//downcasted to String, this is called as UNBOXING....
		copy = copy.concat(" with more data");
		System.out.println(copy);

	}


}