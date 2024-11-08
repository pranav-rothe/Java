package prime;

public class PrimeOne_To_Hundred {

	public static void main(String[] args) {
		int num=100;
		int count;
		
		for(int i=1;i<=num;i++) {
			count=0;
			for(int j=1;j<=num;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" prime number");
			}
		}

	}

}
