package abstractClasses;

public class Main extends AbstractClass{
	
	public void Dog() {
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

	public static void main(String[] args) {
		
		Main m=new Main();
		m.animal();
		m.cat();
//		m.elephant();
		System.out.println(m.methodInt(20,10));

	}
	

}
