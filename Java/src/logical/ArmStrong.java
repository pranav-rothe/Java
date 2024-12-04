package logical;

public class ArmStrong {

	public static void main(String[] args) {
		
		int num=372;
		int sum=0;
		int org=num;
		
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}

		if(org==sum) {
			System.out.println(org+" it is armstrong");
		}
		else {
			System.out.println(org+" it is not armstrong");
		}
	}

}
