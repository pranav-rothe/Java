package casting;

public class A01_Child extends A01_Parent{
	
	public void parentMethod() {
		System.out.println("Overridden parent class method in child class method");
	}
	
	public void childMethod() {
		System.out.println("Child class Method");
	}
	public void otherChild() {
		System.out.println("Other Child Class Method");
	}
	public void anotherChild() {
		System.out.println("Another Child Class Method");
	}
	public void superMethod() {
		super.parentMethod();
	}

}
