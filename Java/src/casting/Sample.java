package casting;

public class Sample {

	public static void main(String[] args) {
		
		
		WebD a=new Main4(); //upcast
//		a.chrome();
//		a.xyz();
//		a.fire();
//		a.web();
		
		TS b=(TS)a; //downcast
		b.chrome();
		b.fire();
		b.web();
		b.batman();
		b.xyz();
		b.superman();
		
	}

}
