package logical;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 12;
		boolean f = false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				f = true;
			}
		}
		if(f) {
			System.out.println(num+ " is not a Prime Number.");
		}
		else {
			System.out.println(num+ " is a Prime Number.");
		}
		
				

	}

}
