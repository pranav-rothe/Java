package controlStatement;

import java.util.Scanner;

public class OddEvenNumber2 
{
	static int num;
	public void oddEvenMethod()
	{
		
		if(num%2==0) 
		{
			System.out.println(num+" is Even Number.");
		}
		else
		{
			System.out.println(num+" is Odd Number.");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		
		OddEvenNumber2 oe=new OddEvenNumber2();
		oe.oddEvenMethod();
	}

}
