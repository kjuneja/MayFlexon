package exception;

public class Example1 {
	
	public static void main(String[] args) {
		
		try {
		int i = 9/0;
		System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("I am outside the try catch");
	}
		

}
