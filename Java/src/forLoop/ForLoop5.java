package forLoop;

public class ForLoop5 {

	public static void main(String[] args) {
		
		//WAP to print even number a 2 to 20 number.".
		
		//syntax:- for(initialization; condition; increment/decrement){
						//statement
		//		   }
		System.out.println(">>>> Even Number <<<<");
		for(int i=2;i<=20;i=i+2) {
			System.out.print(i +"  ");
		}
		
		System.out.println();
		
		System.out.println(">>>> Odd Number <<<<");
		for(int i=1;i<=20;i+=2) {
			System.out.print(i +"  ");
		}
		System.out.println();
		System.out.println("Program Completed.");
		
	}

}
