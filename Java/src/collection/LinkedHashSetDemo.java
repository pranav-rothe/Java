package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l=new LinkedHashSet();
		l.add("Pranav");
		l.add("Aman");
		l.add("Pranav");
		l.add("Aman");
		l.add(500);
		l.add(600);
		l.add(900);
		l.add(true);
		l.add(false);
		l.add(null);
		l.addFirst(1);
		l.addLast(1000);
		
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}		
		System.out.println(l.isEmpty());
		
		boolean b=l.contains("Aman");
		System.out.println(b);
		
		System.out.println(l.reversed());
		
		
	}				
}


