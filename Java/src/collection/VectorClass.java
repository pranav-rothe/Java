package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		for(int i=0;i<=5;i++) {
			v.add(i);
		}
		v.add("Aman");
		v.add("Pranav");
		v.addFirst(101);
		v.addLast(201);
		v.add(3, "Chaha");
		v.set(5, "Three");
		v.add(null);
		v.add("Aman");
		System.out.println(v);
		
		boolean b=v.contains(5);
		System.out.println(b);
		
		Object c=v.getFirst();
		System.out.println(c);
		
		Object c1=v.getLast();
		System.out.println(c1);
		
		v.remove(3);
		System.out.println(v);
		
		Iterator itr=v.iterator();
		
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.print(o+", ");
		}
		System.out.println();
		
		System.out.println("--------------------------------------------");
		
		ListIterator<Object> ltr=v.listIterator(v.size());
		
		while(ltr.hasPrevious()) {
			Object m=ltr.previous();
			System.out.print(m+", ");
		}
		
		System.out.println();
		
		System.out.println("--------------------------------------------");
		
		Enumeration etr=v.elements();
		
		while(etr.hasMoreElements()) {
			Object n=etr.nextElement();
			System.out.print(n+", ");
		}
	}
	

}
