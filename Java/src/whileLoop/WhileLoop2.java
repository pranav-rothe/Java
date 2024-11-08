package whileLoop;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		//WAP to print 1 to number by using while loop and take user input.
				
		//syntax:- while(condition){
						//statement
						//increment/decrement
		//		   }
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		while(num<=20) {
			System.out.println(num+" ");
			num+=2;
		}
		
		System.out.println("Program Completed");
		sc.close();
	}

}
