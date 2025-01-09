package interfacePkg;

public interface SampleA {
	
	int a=10;
	
	default void a() {
		System.out.println("Default method a");
	}
	default void commonName() {
		System.out.println("Common Method A");
	}
	
	private static void pranav() {
		System.out.println("From Private Method Pranav");
	}
	
	default void shell() {
		System.out.println("From Shell");
		pranav();
	}
	
	static void aman() {
		System.out.println("Static method Aman");
		pranav();
	}
	
	default void abc() {
		aman();
		pranav();
	}
	
	default void b() {
		System.out.println("Default method a");
	}
	
	void methodOne(); 
	void methodTwo();
	void methodThree();
	
	public static void main(String[] args) { //but we create main method in interface
		System.out.println("main");
		int a=10;
		System.out.println(a);
		pranav(); //only static method can called in interface main method
		
		
		//SampleA s=new SampleA();  //in interface we cannot create a object
		
	}
	
	

}
