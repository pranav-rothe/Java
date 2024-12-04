package polymorphism_methodOverloading;

public class M01_Overloading {

	int a=10;
	String name="Pranav";

	public static void main(String[] args) {

		M01_Overloading m=new M01_Overloading();
		m.mOne();
		//m.mOne(1, "java");
		//m.mOne(10, 20, "Selenium");
		m.mOne("Pranav", "Rothe");

	}
	
	public void mOne(){
		System.out.println("parameterless");

	}

	public void mOne(int a, String name) { 
		a=20;	//local variable
		name="Java";	//local variable
		System.out.println(a);
		System.out.println(name);
		
	}

	public void mOne(int a, int b, String name) {
		name="Automation";
		int c=a+b;
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.name);
	}
	
	public void mOne(String firstName, String lastName) {
		System.out.println(firstName);
		System.out.println(lastName);
	}
	
}
