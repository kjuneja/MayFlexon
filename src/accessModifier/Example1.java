package accessModifier;

public class Example1 {
	
	public int i = 10;
	int j = 20;
	private int p = 50;
	
	public void test1() {
		System.out.println("Hi I am in the public method of Example 1");
	}
	
	private void test2() {
		System.out.println("Hi I am in the private method of Example 1");
	}
	
	void test3() {
		System.out.println("Hi I am in the default method of Example 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 obj1 = new Example1();
		
		obj1.test1();
		obj1.test2();
		obj1.test3();
		

	}

}
