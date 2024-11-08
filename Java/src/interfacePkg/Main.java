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

	public static void main(String[] args) {
		Main m=new Main();
		m.methodOne();
		m.methodTwo();
		m.methodThree();
		m.a();
		m.b();
		m.commonName();
		m.shell();
		SampleA.aman();
		m.abc();

	}

}
