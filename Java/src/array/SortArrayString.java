package array;

public class SortArrayString {

	public static void main(String[] args) {

		String[] arr = {"banana", "apple", "grape", "cherry", "orange"};
		
		int n=arr.length;
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j].compareTo(arr[j + 1])>0) {
                    // Swap elements 
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		for (String num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
	}

}
