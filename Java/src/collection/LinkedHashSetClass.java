package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet l=new LinkedHashSet();  //It maintain a insertion order 
								 			 // It uses hashTable and linkedList 
		l.add(143);
		l.add("ANIMAL");
		l.add(143.26);
		l.add(true);
		l.add(null);
		l.add('A');
		l.add("ANIMAL");
		l.add(null);
		l.add(null);
		l.add("AMERICA");
		l.add('a');
		l.addFirst("AAA");
		l.addLast("ZZZ");
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		boolean b=l.isEmpty();
		System.out.println(b);
		
		boolean b1=l.contains("ANIMAL");
		System.out.println(b1);
		
		l.remove("AMERICA");
		System.out.println(l);
		
		for(Object o: l) {
			System.out.print(o+"  ");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			Object x=itr.next();
			System.out.print(x+" ");
		}	
		
		System.out.println();
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	
		
	
		
	}

}
