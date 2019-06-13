package excercises;

public class DuplicateValues {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,4,3};
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==arr[i]) {
				System.out.println("The duplicate values is " +i);
			}
		}
	}
}
