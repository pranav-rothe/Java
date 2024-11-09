package array;

public class MaxArray {

	public static void main(String[] args) {
		
		int arr[]= {55,64,20,78,10};
		
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max value: "+max);
	}

}
