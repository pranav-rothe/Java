package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class T01_TreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(101);
		t.add(201);
		t.add(301);
		t.add(401);
		
//		for(Object ts: t) {
//			System.out.println(ts);			
//		}
		
		
//		Iterator<Integer> i=t.iterator();
//		while(i.hasNext()) {
//			int n=i.next();
//			System.out.print(n+" ");
//		}
		
		System.out.println();
		
		Iterator<Integer> i1=t.descendingIterator();
		while(i1.hasNext()) {
			int n1=i1.next();
			System.out.print(n1+" ");
		}
		
		System.out.println();
		
		System.out.println(t.descendingSet());
		
	}

}
