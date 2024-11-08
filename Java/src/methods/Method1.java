package methods;

public class Method1 {

	public static void main(String[] args) {
		//User defined method
		//1. Static Regular Method
		System.out.println("--->>Main method started.<<---");
		System.out.println();
		
		//a. Direct Calling by "MethodName"
		//Syntax - methodname();
		System.out.println("1. Method Calling By Direct methodname();");
		SoftwareTesting();
		Automation();
		Manual();
		System.out.println();
		
		//b. Calling by Class Name
		//Syntax - classname.methodname();
		System.out.println("2. Method Calling By classname.methodname();");
		Method1.Automation();
		Method1.Manual();
		Method1.SoftwareTesting();		
		
		System.out.println();
		System.out.println("--->>Main method ended.<<---");

	}
	public static void SoftwareTesting() { // Method One
		System.out.println("Software Testing Method Called.");
	}
	public static void Automation() { //Method Two
		System.out.println("Automation Method Called.");
	}
	public static void Manual() { //Method Three
		System.out.println("Manual Method Called.");
	}

}
