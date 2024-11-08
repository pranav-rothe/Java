package oops;

public class ParentClass {
	
	static String name;
	static int num;
	
	public void parentMethod() {
		System.out.println("This is Parent Method");
	}
	public void callParent() {
		name="Shrikant Rothe";
		num=952721;
		System.out.println("This is Call Parent Method");
		
	}

}
