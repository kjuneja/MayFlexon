package exception;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		try {
			int i = 9/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("I am your finally block");
		}
	}

}
