package oops;

public class B extends A{
	
	public void methodB() {
		System.out.println("From B");
	}
	public void commonMethod() {
		System.out.println("Common Method from B");
	}
	public void add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		B b=new B();
		b.add(10,10);
		b.add(20, 30, 50);
	}

}
