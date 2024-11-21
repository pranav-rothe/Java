package abstractClasses;

public class ChildClass extends AbstractClass{
	
	public void Dog() {
		super.horse();
		System.out.println("Dog");
	}
	
	@Override
	public void cat() {
		System.out.println("Cat");
	}
	
	@Override
	public void elephant() {
		System.out.println("elephant");
	}
	@Override
	public int methodInt(int a, int b) {
		return a+b;
	}
	
	public ChildClass() {
		super();
		
	}
	
	public ChildClass(int a) {
		super(10);
	}

	public static void main(String[] args) {
		
		ChildClass childClass=new ChildClass();
		childClass.animal();
		childClass.cat();
//		m.elephant();
		System.out.println(childClass.methodInt(20,10));
		childClass.Dog();
		
		ChildClass c=new ChildClass(10);
	}
	

}
