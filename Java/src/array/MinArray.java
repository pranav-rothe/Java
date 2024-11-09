package array;

public class MinArray {

	public static void main(String[] args) {
		
		int arr[]= {55,64,20,78,10};
		
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min value: "+min);
	}
}
