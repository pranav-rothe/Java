package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> f=new ArrayList<String>();
		
		//1. add
		f.add("Mango");
		f.add("Grapes");
		f.add("Apple");
		f.add("Watermelon");
		f.add("Banana");
		System.out.println("1. "+f);
		
		//2. contains
		boolean b1=f.contains("Watermelon");
		System.out.println("2. "+b1);
		
		//3. Ascending order
		Collections.sort(f);
		System.out.println("3. "+f);
		
		//4. Descending order
		Collections.sort(f, Collections.reverseOrder());
		System.out.println("4. "+f);
		
		System.out.println();
		//5. simple for loop
		System.out.println("Simple 'for' loop");
		for(int i=0;i<=f.size()-1;i++) {
			System.out.println(f.get(i));
		}
		
		System.out.println();
		//6. Advance for loop
		System.out.println("Advance 'for' loop");
		for(String str:f) {
			System.out.println(str);
		}
		
		System.out.println();
		//7. iterator
		System.out.println("Iterator forward");
		Iterator i=f.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
		
		System.out.println();
		//8. listIterator
		System.out.println("listIterator forward");
		ListIterator l=f.listIterator();
		while(l.hasNext()) {
			Object obj=l.next();
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("listIterator backward");
		while(l.hasPrevious()) {
			Object obj=l.previous();
			System.out.println(obj);
		}
		
		
		
	}

}
