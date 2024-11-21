package ExceptionHandling;

public class E01_ExceptionHandling {

	public static void main(String[] args) {

		demo();

	}

	public static void demo() {
		
		System.out.println("Program Started");

		try{
			int number=20/0;
			System.out.println(number);
		}
		catch (ArithmeticException a) {
			System.out.println("Exception handle: "+a.getMessage());
		}
		finally {
			System.out.println("Always execute this block");
		}
		System.out.println("Program Closed");
	}

}
