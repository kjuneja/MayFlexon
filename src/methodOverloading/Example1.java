package methodOverloading;

public class Example1 {
	
	// method with one argument
	public void calculateArea(int length) {
		
		System.out.println("This is a method with one parameter");
		System.out.println("The method name is calculateArea(int length)");
	}
	
	// method with two parameter
	public void calculateArea(int length, int breadth) {
		
		System.out.println("This is a method with two parameter");
		System.out.println("The method name is calculateArea(int length, int breadth)");
		
	}

	// method with three parameter
	
    public void calculateArea(int length, int breadth, int height) {
		
		System.out.println("This is a method with three parameter");
		System.out.println("The method name is calculateArea(int length, int breadth, int height)");
		
	}
	
	public static void main(String[] args) {
		
		Example1 obj = new Example1();
		obj.calculateArea(10);
		obj.calculateArea(10, 20);
		obj.calculateArea(10, 20, 30);
		
		
	}
}
