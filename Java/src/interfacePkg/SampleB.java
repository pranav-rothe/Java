package interfacePkg;

public interface SampleB {
	void methodOne(); 
	void methodTwo();
	void methodThree();
	void selfB();
	
	default void b() {
		System.out.println("Default method b");
	}
	default void commonName() {
		System.out.println("Common Method B");
	}

}
