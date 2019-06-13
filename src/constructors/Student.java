package constructors;

public class Student {
	
	public int rollNum;
	public int age;
	public static String school = "USF";
	String subject;
	
	//Constructors name same as class name and it does not have a return type
	public Student(int rollNum, int age) {
		this.rollNum= rollNum;
		this.age = age;
		
		
	}
	//second constructor -- constructor overloading 
	public Student(int rollNum, int age, String subject) {
		this.rollNum= rollNum;
		this.age = age;
		this.subject = subject;
		
		
	}
	// third constructor
	public Student(){
		System.out.println("HI I am defualt explicit constructor");
	}
    // method
	public void display() {
		
		System.out.println("The roll is "+rollNum +" age is "+ age+ " college is "+school );
	}
    public void displaysubject() {
		
		System.out.println("The roll is "+rollNum +" age is "+ age+ " college is "+school+ " subject is "+subject );
	}
    
	public static void main(String[] args) {
		
		Student s1 = new Student(1,25);
		s1.display();
		
		Student s2 = new Student(2,23,"Math");
		s2.displaysubject();
		
	    Student s3 = new Student();
	    s3.display();
			
		
		
		
	}

}
