package list;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector car=new Vector<>();
		
		car.add("Tata");
		car.add("BMW");
		car.add("Hyundai");
		car.add("Ford");
		car.add("Mahindra");
		car.add("MarutiSuzuki");
		
		System.out.println(car);
		
		int c1=car.capacity();
		System.out.println(c1);
		
		Object of=car.firstElement();
		System.out.println(of);
		
		Object ol=car.lastElement();
		System.out.println(ol);
		
		car.addElement(null);
		System.out.println(car);
		
		Object i=car.elementAt(2);
		System.out.println(i);
		
		System.out.println();
		Enumeration e=car.elements();
		while(e.hasMoreElements()) {
			Object v=e.nextElement();
			System.out.println(v);
		}
		
		System.out.println();
		System.out.println(car.size());
		
		System.out.println();
		for(int j=0;j<=car.size()-1;j++) {			
			System.out.println(car.get(j));
		}
		
		System.out.println();
		for(Object x:car) {
			System.out.println(x);
		}
	}

}
