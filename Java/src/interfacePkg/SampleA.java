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
	
	
	void methodOne(); 
	void methodTwo();
	void methodThree();
	
	

}
