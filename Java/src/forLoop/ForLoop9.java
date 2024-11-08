package forLoop;

import java.util.Scanner;

public class ForLoop9 {

	public static void main(String[] args) {
		
		//WAP perform a multiplication by using for loop and taking a user input".
		//Note: not using multiplication operator "*".
		
		//syntax:- for(initialization; condition; increment/decrement){
						//statement
		//		   }
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		
//		int num = 10;
		int num=sc.nextInt();
		int result=0;
		for(int i=1;i<=10;i++) {
			result=result+num;
			System.out.println(num+ " x " +i+ " = "+result);
		}		
		System.out.println("Program Completed.");
		sc.close();		
	}

}
