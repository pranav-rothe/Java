package set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet<String> t=new TreeSet<>();
		t.add("Pranav");
		t.add("Aman");
		t.add("Tejas");
		t.add("Nishant");
		t.add("Ram");
		t.add("Shreyas");
		
		System.out.println(t);
		
		String f=t.floor("y");
		String c=t.ceiling("H");
		
		System.out.println(f);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println(t.getFirst());
		System.out.println(t.getLast());
		
		System.out.println();
		NavigableSet<String> n=t.descendingSet();
		System.out.println(n);
		
		System.out.println();
		Iterator<String> it=t.descendingIterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
		System.out.println();
		String s=t.first();
		System.out.println(s);
	
		
	}

}
