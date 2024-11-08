package methods;

public class Method2 {

	public static void main(String[] args) {
		//User Defined Method
		//1.Static Regular Method
		System.out.println("--->>>Main Method Started<<<---");
		System.out.println();
		
		//a.Direct Calling By MethodName
		//Syntax methodName();
		System.out.println("1. Direct Calling By methodName.");
		Addition();
		Substraction();
		Multiplication();
		Division();
		
		System.out.println();
		
		//b.Calling By Class Name
		//Syntax classname.methodName();
		System.out.println("2. Calling By classname.methodName();");
		Method2.Addition();
		Method2.Substraction();
		Method2.Multiplication();
		Method2.Division();	
		
		System.out.println();
		System.out.println("--->>>Main Method Ended<<<---");
	}	
	public static void Addition() {
		int num1 = 50;
		int num2 = 50;
		System.out.println("Addition Method Called: " + num1+ " + " +num2+ " = " + (num1+num2));
	}
	public static void Substraction() {
		int num1 = 60;
		int num2 = 30;
		System.out.println("Substraction Method Called: " + num1+ " - " +num2+ " = " + (num1-num2));
	}
	public static void Multiplication() {
		int num1 = 5;
		int num2 = 5;
		System.out.println("Multiplication Method Called: " + num1+ " * " +num2+ " = " + (num1*num2));
	}
	public static void Division() {
		float num1 = 63f;
		float num2 = 8f;
		System.out.println("Division Method Called: " + num1+ " / " +num2+ " = " + (num1/num2));
	}

}
