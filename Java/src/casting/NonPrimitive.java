package casting;

public class NonPrimitive {
	public static void main(String[] args) {
		
		int a = 30;
		long l = a; //implicit, up casting, widening
		
		short s = 10;
		int i = s;
		
		long l1 = s;
		
		int i1 = 30;
		short s1 = (short)i1; //explicit, narrowing or down casting
		System.out.println(s1);
		
		long h = 1000;
		int g = (int)h;
		
		int x = 10; //implicit casting
		float f = x;
		
		float f1 = 4.22f;
		int x1 = (int)f1;
		System.out.println(x1); //chances of data loss
		
		long l2 = 65l;
		double d = l2;
		System.out.println(d);
		
		double d1 = 89d;
		long l3 = (long)d1;
		System.out.println(l3);
		
		double m=658.3659d;
		float n=(float)m;
		System.out.println(n);
	}

}
