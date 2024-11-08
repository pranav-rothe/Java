package logical;

public class Prime {

	public static void main(String[] args) {
		int num = 29;
		int flag = 0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				flag++;
			}
		}
		if(flag==2) {
			System.out.println(num+ " is a Prime Number.");
		}
		else {
			System.out.println(num+ " is not a Prime Number.");
		}		


	}

}
