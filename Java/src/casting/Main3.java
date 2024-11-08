package casting;

public class Main3 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.parentMethod();
		c.selfMethod();
		c.childMethod();
		c.otherChild();
		c.anotherChild();
		
		System.out.println();
		System.out.println("--->>> Below is up-casting <<<---");
		System.out.println();
		
		Parent u = new Child();
		u.parentMethod();
		u.selfMethod();
		
		System.out.println("");
		System.out.println("--->>> Below is down-casting <<<---");
		System.out.println();
		
		Child d = (Child)u;
		d.childMethod();
		d.anotherChild();
		d.otherChild();
		d.selfMethod();
		d.parentMethod();
		d.superMethod();
		
		 

	}

}
