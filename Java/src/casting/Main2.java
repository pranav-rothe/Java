package casting;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("-->>Up-Casting Here<<--");
		Animal a = new Elephant(); //Up-Casting
		a.eating(); //We restricted child class method.
		a.self();
		
		System.out.println("---------------------------");
		System.out.println("-->>Down-Casting Here<<--");
		
		Elephant e = (Elephant)a; //Down-Casting
		e.eating();
		e.self();
		e.walking();
	}
	

}
