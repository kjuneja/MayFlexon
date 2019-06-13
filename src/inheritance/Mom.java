package inheritance;

public class Mom {
	
	int i = 90;
	public int k = 80;
	private int l = 60;
	
	//public method
	public void test1() {
		
		System.out.println("I am in the parent class test1  method ");
	}
	
	// protected method
	
    protected void test2() {
		
		System.out.println("I am in the parent class test2  method ");
	}
    
    //private method
    
    private void test3() {
    	
    	System.out.println("I am in the parent class test3  method ");
    	
    }
    
    // static method
    static public void test4() {
    	
    	System.out.println("I am in the parent class test4  method ");
    }
    
    //final
    
    final public void test5() {
    	System.out.println("I am in the parent class test5 final method ");
    }

}
