package exception;

public class Example2 {

	public static void main(String[] args) {
		
		try {
			//int a = 10/0;
			//String s1 = null;
			//s1.toCharArray();
			int arr[]  = {0,2,3};
			System.out.println(arr[3]);
			
		}catch (ArithmeticException e) {
			System.out.println("Artithmetic Exception is getting called");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is getting called");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("All other Exceptions");
			e.printStackTrace();
		}
		
		System.out.println("running your code after exception 1 ");
		System.out.println("running your code after exception 2 ");
		System.out.println("running your code after exception 3 ");
		
	}
}
