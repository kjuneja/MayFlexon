package superKeyword;

public class Example2 extends Example1 {
	
	String name;
	
	Example2(String name, int salary, int age){
		
		super(salary, age);
		this.name = name;
			
	}
	
	Example2(){
		
		System.out.println("I am child constructor");
	}
	
	void displayDetails() {
		
		System.out.println("Name is "+name+" Salary is "+salary+ " Age is "+age );
	}
	
	public static void main(String[] args) {
		
		Example2 obj = new Example2("Tanay", 2000, 25);
		
		obj.displayDetails();
		
	}

}
