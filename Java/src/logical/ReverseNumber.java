package logical;

import java.util.Scanner;

public class ReverseNumber {	
	public static void main(String[] args)
	{
		int number;
		int remainder;
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: " );
		number=sc.nextInt();		
		while(number!=0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}		
		System.out.println("Reverse Number: "+reverse);
		sc.close();
	}

}
