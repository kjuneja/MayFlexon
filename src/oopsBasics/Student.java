package oopsBasics;

public class Student {
	
	// properties
	//constructors
	//methods
	//variables
	
	int rollNum;
	String University = "USF";
	String Name;
	
	// methods
	
	public void test() {
		System.out.println("Hey you are in the test Method");
	}

	
	public static void mian(String[] args) {
		// TODO Auto-generated method stub
      
		Student student1 = new Student();
		System.out.println(student1.University);
		student1.test();

	}

}
