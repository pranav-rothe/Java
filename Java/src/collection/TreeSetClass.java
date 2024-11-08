package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();//It stored the data as per ASCII sorted(Sorting)
		ts.add("PRANAV");
		ts.add("AMAN");
//		ts.add('A');
//		ts.add('B');
//		ts.add(50);
//		ts.add(100);
//		ts.add(25.264);
		ts.add("PRANAV");
		ts.add("NISHANT");
		ts.add("JAYESH");
		ts.add("ANUJ");
		ts.add("TEJAS");
		ts.add("1");
		ts.add("2");
		ts.add("2.3");
		ts.add("6.5");	
		
		System.out.println(ts);
		
		boolean b=ts.contains("AMAN");
		System.out.println(b);
		
		System.out.println(ts.isEmpty());
		
		ts.remove("TEJAS");
		System.out.println(ts);
		
		Object x=ts.first();
		System.out.println(x);
		
		Object y=ts.last();
		System.out.println(y);
		
		ts.pollFirst();
		System.out.println(ts);
		
		ts.pollLast();
		System.out.println(ts);
		
		System.out.println("----------------------------------------");
		
		Iterator itr=ts.iterator();
		
		while(itr.hasNext()) {
			Object m=itr.next();
			System.out.print(m+"  ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------");
		
		for(Object z:ts) {
			System.out.print(z+" , ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------");
		
		Iterator dtr=ts.descendingIterator();
		
		while(dtr.hasNext()) {
			Object k=dtr.next();
			System.out.print(k+" , ");
		}
	
	}

}
