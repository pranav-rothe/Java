package javaPractice;

public class A01_MethodOverloading {

	
	static int y=10;	
	
	public void a() {
		System.out.println(y);
		System.out.println("Without parameter");
	}

	public void a(int y) {
		
		System.out.println("one para with int data type");
	}

	public void a(int a, String name) {
		y=20;
		System.out.println(y);
		System.out.println("two para with one int data type and second is string datatypes");
	}

	public void a(String a) {
		System.out.println("one para with String data type");
	}

	public static void main(String[] args) {

		A01_MethodOverloading a1=new A01_MethodOverloading();
//		System.out.println(y);
		a1.a();
		a1.a(10);
		a1.a("Pranav");
		a1.a(10, "Cricket");

	}

}
