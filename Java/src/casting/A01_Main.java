package casting;

public class A01_Main {

	public static void main(String[] args) {
		
//		A01_Child c = new A01_Child();
//		c.parentMethod();
//		c.selfMethod();
//		c.childMethod();
//		c.otherChild();
//		c.anotherChild();
		
		System.out.println();
		System.out.println("--->>> Below is up-casting <<<---");
		System.out.println();
		
		A01_Parent u = new A01_Child(); //Up-Casting 
		u.parentMethod();
		u.parentselfMethod();
		
		System.out.println("");
		System.out.println("--->>> Below is down-casting <<<---");
		System.out.println();
		
		A01_Child d = (A01_Child)u; //Down-Casting--In down casting we have accessed both parent and child method  
		d.childMethod(); //Accessing a child method
		d.anotherChild(); //Accessing a child method
		d.otherChild(); //Accessing a child method
		d.parentselfMethod(); //Accessing a parent method
		d.parentMethod(); //Overridden parent method
		d.superMethod(); //calling a parent method via using super
		
		 

	}

}
