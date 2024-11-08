package controlStatement;

import java.util.Scanner;

public class LargestNumber 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		
		System.out.println("---->LARGEST NUMBER PROGRAM<----");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter second number: ");
		b=sc.nextInt();
		System.out.println("Enter third number: ");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is a largest number.");
		}
		else if(b>a && b>c) 
		{
			System.out.println(b+" is a largest number.");
		}
		else
		{
			System.out.println(c+" is a largest number.");
		}
		sc.close();
			
	}

}
