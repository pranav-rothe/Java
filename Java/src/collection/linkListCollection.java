package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkListCollection {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();	
		
		l.add("Pranav");
		l.add("Rothe");
		l.add(41);
		l.add(786.412);
		l.add(null);
		l.add(null);
		l.add(null);
		l.add(null);
		l.add(null);
		l.add(true);
		l.add(false);
		l.add("Pranav");
		l.add("Rothe");
		
		System.out.println(l);
		
		boolean b=l.contains("Rothe");
		System.out.println(b);
		
		l.add(1, "rothe");
		System.out.println(l);
		
		l.set(1, "Shrikant");
		System.out.println(l);
		
		boolean b1=l.isEmpty();
		System.out.println(b1);
		
		l.remove(false);
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		int i=l.size();
		System.out.println(i);
		
		l.addFirst(1);
		System.out.println(l);
		
		l.addLast(13);
		System.out.println(l);
		
		Object o=l.getFirst();
		System.out.println(o);
		
		Object o1=l.getLast();
		System.out.println(o1);
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			Object w=itr.next();
			System.out.print(w+", ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------");
		
		ListIterator<Object> ltr=l.listIterator(l.size());
		
		while(ltr.hasPrevious()) {
			Object n=ltr.previous();
			System.out.print(n+", ");
		}
	}

}
