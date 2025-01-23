package logical;

public class Array1 {

	public static void main(String[] args) {

		int[] arr= {1, 235, 145, 160, 250};
		int[] arr2=new int[arr.length];
		int num=0;
		for(int i=0;i<=arr.length-1;i++) {
			num=arr[i];
			while(num>=10) {
				num=num/10;
			}
		}
		System.out.println(num);
		
		
	}

}
