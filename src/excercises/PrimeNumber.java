package excercises;

public class PrimeNumber {
 public static void main(String[] args) {
	 
	  System.out.print("Prime numbers from 1 to 100 are:");
	 
	        for(int i=2;i<100;i++){
	            int num=1;
	            for(int j=2;j<i;j++){
	                if(i%j ==0){
	                    num=0;
	                    break;
	                }

	            }if(num==1){
	                System.out.print(" "+ i);

	            }
	        }
	      

	    }
}