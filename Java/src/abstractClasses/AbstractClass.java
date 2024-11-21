package abstractClasses;

//Abstract class gives a 0 to 100% data hiding abstractions but in interface it gives a 100% data hiding or abstraction
public abstract class AbstractClass {
	
	public void animal(){  //Declaration
		System.out.println("animal");  //Definition
	}
	
	public void horse() {
		System.out.println("horse");
	}
	
	public abstract void cat(); //It is a incomplete method.
	
	protected abstract void elephant();
	
	public abstract int methodInt(int a, int b);
	
	
	public AbstractClass() {
		System.out.println("Constructor can be created");
	}
	
	public AbstractClass(int a) {
		System.out.println("Constructor can be created by para");
	}


}
