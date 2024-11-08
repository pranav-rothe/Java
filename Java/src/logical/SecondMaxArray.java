package logical;

public class SecondMaxArray {

	public static void main(String[] args) {

		int arr[]= {1,6,8,3,5,6,8};
		
		int Largest=0;
		int secondLarge=0;
	
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]>Largest) {
				secondLarge=Largest;
				Largest=arr[i];
			}
//			else if(arr[i]>secondLarge && arr[i] != Largest) {
//			
//			secondLarge=arr[i];
//			}
		}
		System.out.println("Second Largest: "+secondLarge);
	}

}
