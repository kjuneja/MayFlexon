package exception;

import java.io.IOException;

public class ThrowsInJava {
	
	public void validateAge(int age) throws IOException{
		
		if(age<18) {
			throw new ArithmeticException("Person is not the right age for voting");
		}
		else {
			System.out.println("Person is valid age");
		}
		
	}
	public static void main(String[] args) throws IOException{
		ThrowsInJava obj = new ThrowsInJava();
		obj.validateAge(17);
		
	}

}
