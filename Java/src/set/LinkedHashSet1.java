package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> num=new LinkedHashSet<>();
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(4);
		num.add(3);
		System.out.println(num);
		
		
		System.out.println(num.add(6));
		System.out.println(num);
		
		num.addFirst(0);
		num.addLast(10);
		System.out.println(num);
		
		num.remove(0);
		System.out.println(num);
		
		
		System.out.println(num.getFirst());
		System.out.println(num.getLast());
		
		System.out.println();
		for(Integer n:num) {
			System.out.println(n);
		}
		
		System.out.println();
		Iterator it=num.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println(num.reversed());
		
		
	}

}
