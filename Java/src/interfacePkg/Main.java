package interfacePkg;

public class Main implements SampleA, SampleB {
	
	public void methodOne() {
		System.out.println("Interface methodOne");
	}
	public void methodTwo() {
		System.out.println("Interface methodTwo");
	}
	public void methodThree() {
		System.out.println("Interface methodThree");
	}
	public void selfB() {
		System.out.println("Self B");
	}
	public void commonName() {
		System.out.println("From Main");
	}

	@Override
	public void b() {
		System.out.println("I am Superman");
		SampleA.super.b();
		SampleB.super.b();
	}
	public static void main(String[] args) {
		Main m=new Main();
		m.b();
//		m.methodOne();
//		m.methodTwo();
//		m.methodThree();
//		System.out.println("-------------------------------");
//		m.a();
//		m.b();
//		System.out.println("-------------------------------");
//		m.commonName();
//		m.shell();
//		SampleA.aman();
//		m.abc();

	}

}
