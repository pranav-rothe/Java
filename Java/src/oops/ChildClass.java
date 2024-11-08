package oops;

public class ChildClass extends ParentClass{
	
	public void childParent() {
		System.out.println("This is child method.");
	}
	public void staticVariable() {
		System.out.println("Name: "+name);
		System.out.println("Number: "+num);
	}
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.parentMethod();
		cc.callParent();
		cc.childParent();		
		cc.staticVariable();
	}

}
