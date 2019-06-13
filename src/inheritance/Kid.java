package inheritance;

public class Kid extends Mom {
	
	public static void main(String[] args) {
		
		Kid obj = new Kid();
		
		obj.test1();
		obj.test2();
		Mom.test4();
		obj.test5();
		
		System.out.println(obj.i + obj.k );
		
	}

}
