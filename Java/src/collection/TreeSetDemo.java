package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Pranav");
		ts.add("Aman");
		ts.add("Mangesh");
		ts.add("Ranjeet");
		ts.add("Amol");
		ts.add("Sanjay");
		ts.add("true");
		ts.add("Aman");
		ts.add("Vikrant");
//		ts.add(null);
		
		System.out.println(ts);
		
//		ts.addFirst("First");
//		System.out.println(ts);
//		
//		ts.addLast("Last");
//		System.out.println(ts);
		
		System.out.println(ts.first());
		
		System.out.println(ts.last());
		
		Object a=ts.contains("Mangesh");
		System.out.println(a);
		
		System.out.println(ts.isEmpty());
		
		int i=ts.size();
		System.out.println(i);
		
		ts.pollFirst();
		System.out.println(ts);
		
		ts.pollLast();
		System.out.println(ts);
		
		String s=ts.getFirst();
		System.out.println(s);
		
		String s1=ts.getLast();
		System.out.println(s1);
		
		Iterator itr=ts.descendingIterator();
		while(itr.hasNext())
		{
			Object x=itr.next();
			System.out.print(x+" ");
		}
	}
			
}

/*
*/
