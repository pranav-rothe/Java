package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList x=new LinkedList();
		x.add("Pranav");
		x.add("Aman");
		x.add(45);
		x.add(65);
		x.add('A');
		x.add('f');
		x.add(null);
		x.add("Aman");
		x.add(true);
		x.add(false);
		x.add(true);
		x.add(65.546);
		x.add(null);
		
		System.out.println(x);
		
		x.addFirst("first");
		System.out.println(x);
		
		x.addLast("last");
		System.out.println(x);
		
		boolean b=x.contains("Pranav");
		System.out.println(b);
		
		x.set(13, "replace");
		System.out.println(x);
		
		x.remove(true);
		System.out.println(x);
		
//		Iterator itr=x.iterator();
//		while(itr.hasNext())
//		{
//			Object o=itr.next();
//			System.out.print(o+ "  ");
//		}
		
		ListIterator ltr1=x.listIterator();//first we store a object in forward direction then and only then we can iterate in reverse direction
		while(ltr1.hasNext())			//the reason is if there is nothing stored in iterator then how we can iterate in reverse direction(Previous)
		{
			Object o2=ltr1.next();
			System.out.print(o2+"  ");
		}
		
		System.out.println();
		
		while(ltr1.hasPrevious())
		{
			Object o1=ltr1.previous();
			System.out.print(o1+ "  ");
		}
		
		System.out.println();
		
		ListIterator<Object>ltr=x.listIterator(x.size());//second approach
		while(ltr.hasPrevious())
		{
			Object o1=ltr.previous();
			System.out.print(o1+ "  ");
		}
			
	}

}
