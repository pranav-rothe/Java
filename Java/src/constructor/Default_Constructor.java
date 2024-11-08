package constructor;

public class Default_Constructor {
	
	
	int a;
	int b;
	
	public Default_Constructor() {
		a=20;
		b=20;
	}
	public Default_Constructor(int x, int y) {
		this.a=x;
		this.b=y;
	}
	
	public void add() {
		
		System.out.println(a+b);
	}
	public void Default_Constructor() {
		System.out.println("I'm Classname method.");
	}

	public static void main(String[] args) {
		Default_Constructor d=new Default_Constructor();
		d.add();
		Default_Constructor d1=new Default_Constructor(60,60);
		d1.add();
		d.Default_Constructor();
		
		

	}

}
