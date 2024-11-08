package casting;

public class Main {

	public static void main(String[] args) {
		PrimitiveA x = new PrimitiveA();
		x.a();
		
		System.out.println("-----------------------------------");
		
		PrimitiveB y = new PrimitiveB();
		y.a();
		y.b();
		
		System.out.println("-----------------------------------");
		
		PrimitiveA u = new PrimitiveB();//Up-casting, widening, implicit casting.
		u.a();
		u.pranav();
		
		System.out.println("-----------------------------------");		
		
		//u is object of up-casting always remember when perform down-casting 
		//first we need up-casting
		PrimitiveB d = (PrimitiveB)u; 
		d.a();
		d.b();
		d.pranav();
		d.c();

	}

}
