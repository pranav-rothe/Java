package logical;

public class DuplicateNumbersArray {

	public static void main(String[] args) {
		
		int arr[]= {2, 6, 2, 3, 4, 7, 6, 3, 10, 10};
		
		int lenArray=arr.length;
		
		for(int i=0;i<lenArray;i++) {
			for(int j=i+1;j<lenArray;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
