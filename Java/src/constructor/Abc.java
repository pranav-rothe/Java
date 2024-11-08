package constructor;

public class Abc {

	
	int x;
	
	public Abc() {
		x=5;		
	}
	public Abc(int y) {
		this.x=y;
	}
	public static void main(String[] args) {
		Abc a=new Abc(6);
		System.out.println(a.x);
		
		
		
		
	}

}
