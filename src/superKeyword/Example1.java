package superKeyword;

public class Example1 {
	
	// non static variables
	
	int salary;
	int age;
	
	
	//default explicit
	Example1(){
		
		System.out.println("I am in the Parent Constructor");
		
	}

    Example1(int salary, int age){
    	
    	this.salary = salary;
    	this.age = age;
		
		
	}
    
    public int getSalary() {
    	return salary;
    }
    
    public int getAge() {
    	
    	return age;
    }
}
