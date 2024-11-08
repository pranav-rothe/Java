package abstractClasses;

//Abstract class gives a 0 to 100% data hiding abstractions but in interface it gives a 100% data hiding or abstraction
public abstract class AbstractClass {
	
	public void animal(){  //Declaration
		System.out.println("animal");  //Definition
	}
	public abstract void cat(); //It is a incomplete method.
	
	protected abstract void elephant();
	
	public abstract int methodInt(int a, int b);

}
