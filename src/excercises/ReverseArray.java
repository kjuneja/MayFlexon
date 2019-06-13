package excercises;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int arr[] = {10,45,32,32,67};
		Arrays.sort(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[arr.length-1]);
		}
		
		for(int i=arr.length-1; i>=0;i--) {
			
			//System.out.println(arr[i]);
		}
		
		
	}

}
