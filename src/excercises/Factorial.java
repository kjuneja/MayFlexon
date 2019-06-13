package excercises;

public class Factorial {
	
	public void FacMeth(int n) {
		int j =1;
		for(int i =1; i<=n; i++) {
			j = j*i;
			
		}
		System.out.println("Factorial of "+n+ " is: "+j);
	}
	
	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		obj.FacMeth(6);
	}

}
