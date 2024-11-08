package casting;

public class PrimitiveB extends PrimitiveA{

	
		public void a() {
			System.out.println("From Parent Overrided");
		}
		public void b() {
			System.out.println("Child");
		}
		public void c() {
			super.a();
		}

}
