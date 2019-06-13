package excercises;

public class ArmStrong {
	
	public void armStrong(int n) {
		int a;
		int p = n;
		int c = 0;
		
		while(n>0) {
			a = n%10;
			n = n/10;
			c = c+(a*a*a);
			
		}
		if(p==c) {
			System.out.println("It is an ArmStrong");
		}
		else {
			System.out.println("It is not an ArmStrong");
		}
		
	}

	public static void main(String[] args) {
		
		
		ArmStrong arm = new ArmStrong();
		
		arm.armStrong(121);
		

		
	}

}
