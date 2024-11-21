package logical;

import java.util.Scanner;

public class NumbersConsecutive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2=sc.nextInt();
		System.out.println("Enter 3rd number");
		int n3=sc.nextInt();
		
		int a=n2-n1;
		int b=n3-n2;
		
		if(a==b) {
			System.out.println("Consecutive");
		}
		else {
			System.out.println("Not");
		}
	}

}
