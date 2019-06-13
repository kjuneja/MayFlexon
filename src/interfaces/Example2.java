package interfaces;

public class Example2 implements Example1 {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1 Implementation for Example 2");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
		System.out.println("Test2 Implementation for Example 2");
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
		System.out.println("Test3 Implementation for Example 2");
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
		System.out.println("Test4 Implementation for Example 2");
		
	}
	
	public static void main(String[] args) {
		
		Example2 obj = new Example2();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}
	
	

}
