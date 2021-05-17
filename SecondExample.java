class SecondExample{
	public static void main(String[] args) {
		System.out.println("Enter the Name");
		String name = System.console().readLine();

		System.out.println("Enter the Address");
		String address = System.console().readLine();

		System.out.println("Enter the Age");
		String result = System.console().readLine();
		int age = Integer.parseInt(result);//store whole numbers

		System.out.println("The Name entered is " + name);
		System.out.println("The Address entered is " + address);
		System.out.println("The Age entered is " + age);				
		System.out.println("U will retire after " + (50 - age) + " years");				
	}
}