package logical;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		//int count = 10;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int a = 0, b = 1;

		System.out.print("Fibonacci Series: " +a+ " " +b); //Printing a first & second number

		for(int i=2;i<=count;i++) {//loops start with 2 because 1 and 2 already printed)
			int c = a + b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
		sc.close();

	}

}
