package array;

public class SortArrayNumeric {
	public static void main(String[] args) {
		int arr[]= {1,10,5,2};

		int n=arr.length-1;
		for (int i=0;i<n; i++) {
			for (int j=0;j<n;j++) {
				if (arr[j]>arr[j + 1]) {
					// Swap elements 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}


