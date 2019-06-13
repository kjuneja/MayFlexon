package staticandNonstatic;

public class Example2 {
	
	
	 //static and non static variables
	 int i = 90;
	 static int j = 100;
	 
	 //create a non static method
	 
	 public void test1() {
		 System.out.println("Hi I am in the Non Static Method");
		 System.out.println("Printing non static variable from non static variable "+i);
		 System.out.println("Printing the static variable from non static variable "+j);
	 }

	 //create static method
	 public static void test2() {
		 System.out.println("Hi I am in the Static Method");
		 //System.out.println("Printing non static variable from static variable "+i);
		 System.out.println("Printing the static variable from static variable "+j);
	 }
	 
	public static void main(String[] args) {
		
		Example2 obj1 = new Example2();
		
		obj1.test1();
		Example2.test2();
	}
}
