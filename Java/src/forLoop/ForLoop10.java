package forLoop;

import java.util.Scanner;

public class ForLoop10 {

	public static void main(String[] args) {
		
		//WAP to find the factorial of user input number".
		//Note: not using multiplication operator "*".
		
		//syntax:- for(initialization; condition; increment/decrement){
						//statement
		//		   }
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}	
		System.out.println("Factorial of "+num+" is: "+fact);
		System.out.println("Program Completed.");
		sc.close();		
	}

}
