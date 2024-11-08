package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();  //Sort by ASCII value
								 // It uses hashTable and default value is 16
		h.add(143);
		h.add("ANIMAL");
		h.add(143.26);
		h.add(true);
		h.add(null);
		h.add('A');
		h.add("ANIMAL");
		h.add(null);
		h.add(null);
		h.add("AMERICA");
		h.add('a');
		
		System.out.println(h);
		
		System.out.println(h.size());
		
		boolean b=h.isEmpty();
		System.out.println(b);
		
		boolean b1=h.contains("ANIMAL");
		System.out.println(b1);
		
		h.remove("AMERICA");
		System.out.println(h);
		
		for(Object o: h) {
			System.out.print(o+"  ");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
		Iterator itr=h.iterator();
		
		while(itr.hasNext()) {
			Object x=itr.next();
			System.out.print(x+" ");
		}		
		System.out.println();
		
		String str=h.toString();
		System.out.println(str);
		
		
	}

}
