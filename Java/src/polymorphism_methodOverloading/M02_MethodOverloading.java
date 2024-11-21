package polymorphism_methodOverloading;

public class M02_MethodOverloading {
	
	public void main() {
		System.out.println("without para");
	}
	
	public static void main(int a) {
		System.out.println("with one int para");
	}
	
	public static void main(String a) {
		System.out.println("with one String para");
	}
	
	public static void main(String[] args) {
		M02_MethodOverloading m=new M02_MethodOverloading();
		m.main();
		main(10);
		main("pranav");
	}

}
