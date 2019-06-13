package inheritance;

public class Child extends Parent {

	public void childMethod() {
		System.out.println("You are in your child method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj1 = new Child();
		obj1.childMethod();
		obj1.parentMethod();

	}

}
