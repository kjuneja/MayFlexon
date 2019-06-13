package excercises;

public class BubbleSort {
	
	public void bubbleSort(int arr[]) {
		
		int n = arr.length;
		for(int i =0; i<n-1; i++) {
			for (int j =0; j<n-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					int p = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= p;
				}
			}
			
		}
		
	}
	public void printArr(int arr[]) {
		int n = arr.length;
		for (int i=0; i<n;i++) {
			System.out.print(" "+arr[i]);
		
	}
	}
	
	public static void main(String[] args) {
		
		BubbleSort bs = new BubbleSort();
		
		int arr[] = {6,5,3,3,8,7,4,4};
		bs.bubbleSort(arr);
		bs.printArr(arr);
			
		}
	}



