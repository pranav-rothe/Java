package forLoop;

import java.util.Scanner;

public class ForLoop8 {

	public static void main(String[] args) {
		
		//WAP perform a multiplication by using for loop by  taking a user input".
		
		//syntax:- for(initialization; condition; increment/decrement){
						//statement
		//		   }
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+ " x " +i+ " = "+num*i);
		}		
		System.out.println("Program Completed.");
		sc.close();		
	}

}
