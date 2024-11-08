package oops;

public class C extends A {
	
	public void methodC() {
		System.out.println("From C");
	}
	public void commonMethod() {
		System.out.println("Override Method");
	}
	public static void main(String[] args) {
		C c=new C();
		c.methodA();
//		c.methodB();
		c.methodC();
		c.commonMethod();
	}

}
