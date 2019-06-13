package abstractClass;

public class Test extends Example1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj1 = new Test();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		obj1.test4();
		
		
		

	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("I am in the implemented test1 method of Test class");
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
		System.out.println("I am in the implemented test4 method of Test class");
		
	}

}
