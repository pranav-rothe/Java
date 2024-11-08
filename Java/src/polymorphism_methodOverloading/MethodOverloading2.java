package polymorphism_methodOverloading;

public class MethodOverloading2 extends MethodOverloading1{
	
	//Automatic promotion
	public void methodOne() {
		System.out.println("Method One");
	}
	public void methodOne(byte i) {
		
		System.out.println("Byte value");
	}
	public void methodOne(short i) {
		System.out.println("Short value");
	}
	public void methodOne(char i) {
		System.out.println("Character value");
	}
	public void methodOne(int i) {
		System.out.println("Integer value");
	}
	public void methodOne(float i) {
		System.out.println("Float value");
	}
	public void methodOne(long i) {
		System.out.println("Long value");
	}
	public static void main(String[] args) {
		MethodOverloading2 mo=new MethodOverloading2();
		mo.methodOne('a');
	}

}
