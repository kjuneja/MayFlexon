package excercises;

public class FibonacciNumbers {
	
	public static void main(String[] args) {
		
		int n = 0; int n1 = 1; int num;
		
		System.out.print(n);
		
		for (int i=0; i<10; i++) {
			num = n+n1;
			System.out.print(" "+num);
			n = n1;
			n1 = num;
		}
		
	}

}
