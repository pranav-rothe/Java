package logical;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double num1,num2,result;

		System.out.println("Select operator (+,-,*,/)");
		String operator=sc.next();
		System.out.println("Enter first num: ");
		num1=sc.nextDouble();

		System.out.println("Enter second num: ");
		num2=sc.nextDouble();

		switch(operator) {
		case "+":
			result=num1+num2;
			System.out.println(num1+ " + "+num2+" = "+result);
			break;
		case "-":
			result=num1-num2;
			System.out.println(num1+ " - "+num2+" = "+result);
			break;
		case "*":
			result=num1*num2;
			System.out.println(num1+ " * "+num2+" = "+result);
			break;
		case "/":
			if(num2>0){
				result=num1/num2;
				System.out.println(num1+ " / "+num2+" = "+result);		
			}
			else {
				System.out.println(num2+" cannot divide by zero in division");
			}
			break;
		default:
			System.out.println("Invalid Operator");
		}
		sc.close();
	}
}
