package polymorphism_methodOverriding;

public class MethodOverriding2 extends MethodOverriding1 {
	
	@Override
	public void methodOne() {
		super.methodOne(); //calling parent method by using super keyword
		System.out.println("MethodOverriding2 from methodOne");
	}
	@Override
	public void methodTwo() {
		System.out.println("MethodOverriding2 from methodTwo");
	}
	@Override
	public void methodThree() {
		System.out.println("MethodOverriding2 from methodThree");
	}
	public void methodFour() {
		System.out.println("MethodOverriding2 from methodFour");
	}
	public void six() {
		super.methodOne();
	}
	public static void main(String[] args) {
		
		MethodOverriding2 m2=new MethodOverriding2(); 
		m2.methodOne();
		m2.methodTwo();
		m2.methodThree();
		m2.methodFour();	
		
		System.out.println("--------------------------------");
		
		MethodOverriding1 m1=new MethodOverriding1(); //Static Binding
		m1.methodOne();
		m1.methodTwo();
		m1.methodThree();
		
		System.out.println("--------------------------------");
		
		MethodOverriding1 m3=new MethodOverriding2(); //Dynamic Binding/Up-casting
		m3.methodOne();
		m3.methodTwo();
		m3.methodThree();
		m3.methodFive();	
	}
}
