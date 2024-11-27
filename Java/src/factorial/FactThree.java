package factorial;

import java.util.Scanner;

public class FactThree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		int factNum=1;
		
		for(int i=1;i<=num;i++) {
			factNum=factNum*i;
		}
		System.out.println(factNum);

	}

}
