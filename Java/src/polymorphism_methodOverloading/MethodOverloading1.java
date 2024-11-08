package polymorphism_methodOverloading;

public class MethodOverloading1 {

	public void methodOne() {
		System.out.println("Method one with zero parameter.");
	}
	public void methodOne(int i) {
		System.out.println("Method one with one parameter: "+i);
	}
	public void methodOne(String name) {
		System.out.println("Method one with one parameter but with \ndifferent dataTypes: "+name);
	}
	public void methodOne(int i, int j) {
		System.out.println("Method one with two parameter: "+(i+j));
	}
	public void methodOne(int i, String name) {
		System.out.println("Method one with two parameter but with \ndifferent dataTypes: "+i+", "+name);
	}
	public void methodOne(int i, float j, String name) {
		System.out.println("Method one with three parameter but with \ndifferent dataTypes: "+i+", "+j+", "+name);
	}
	public static void main(String[] args) {
		MethodOverloading1 mo=new MethodOverloading1();
		System.out.println("<<< MethodOverloading concept >>>");
		System.out.println();
		mo.methodOne();
		System.out.println();
		mo.methodOne(10);
		System.out.println();
		mo.methodOne("Pranav");
		System.out.println();
		mo.methodOne(10, 20);
		System.out.println();
		mo.methodOne(10, "Pranav");
		System.out.println();
		mo.methodOne(10, 20.52f, "Pranav");
	}

}
