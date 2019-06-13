package encapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account();
		
		acc1.setAcc_no(1234567L);
		acc1.setAmount(1000.2f);
		acc1.setName("David");
		acc1.setEmail("david@gmail.com");
		
		System.out.println("Your Bank Details are "+ acc1.getAcc_no() + "*****" + acc1.getAmount()+"*****" + acc1.getName()+"*****"+acc1.getEmail());
		
	}

}
