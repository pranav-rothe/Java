package ExceptionHandling;

public class E02_ExceptionHandling {

	public static void main(String[] args) throws IllegalAccessException {

		demo(15);
		
	}

	public static void demo(int age) throws IllegalAccessException {
		if(age<18) {
			throw new IllegalAccessException("Age must be above 18");
		}
		
		
	}

}
