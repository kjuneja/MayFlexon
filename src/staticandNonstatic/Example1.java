package staticandNonstatic;

public class Example1 {
	
	//non static variable are also called as instance variables 
	public int i = 90;
	
	//static variable
	public static int j = 100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 obj1 = new Example1();
		
		//calling non static variable
		System.out.println(obj1.i);
		

		//calling static variable
		
		System.out.println(Example1.j);
		

	}

}
