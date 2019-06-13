package exception;

public class ThrowInJava {
	
	public void validateAge(int age) {
		if(age<18) {
			throw new ArithmeticException("not a valid age for voting");
		}
		else {
			System.out.println("Valid age for voting");
		}
	}
	
	public static void main(String[] args) {
		ThrowInJava obj = new ThrowInJava();
		obj.validateAge(17);
		
	}

}
