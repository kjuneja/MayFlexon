package superKeyword;

public class Cat extends Animal {
	
	public String color = "black";
	
	public void displayColor() {
		
		System.out.println("Color is "+ color);
		System.out.println("Color is "+ super.color);
		
	}

	
	public static void main(String[] args) {
		
		
		Cat obj = new Cat();
		
		obj.displayColor();
		
		
	}
}
