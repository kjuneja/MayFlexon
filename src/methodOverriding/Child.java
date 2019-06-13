package methodOverriding;

public class Child extends Parent {
	
	// run time polymorphism 
	
	// overriding is done at run time
	public void test() {
		System.out.println("I am a method from child class");
	}

	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.test();
		
	}
}

// We cannot override the final method and static method. Private class can also not override. 