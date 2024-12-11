package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> l1=new LinkedList<String>();
		
		//1.add
		l1.add("Java");
		l1.add("Python");
		l1.add("Ruby");
		l1.add("Selenium");
		l1.add("JavaScript");
		
		System.out.println(l1);
		
		//2.addFirst
		l1.addFirst("C++");
		System.out.println(l1);
		
		//3.addLast
		l1.addLast("Testing");
		System.out.println(l1);
		
		//4.contains
		boolean b=l1.contains("Selenium");
		System.out.println(b);
		
		//5.isEmpty
		boolean b1=l1.isEmpty();
		System.out.println(b1);
		
		//6.set
		l1.set(3, "C#");
		System.out.println(l1);
		
		//7.getFirst
		String str1=l1.getFirst();
		System.out.println(str1);
		
		//8.getLast
		String str2=l1.getLast();
		System.out.println(str2);
		
		System.out.println();
		System.out.println("New Linked List");
		LinkedList<String> l2=new LinkedList<>();
		l2.addAll(l1);
		System.out.println(l2);
		
		boolean b2=l2.containsAll(l1);
		System.out.println(b2);
		
		l2.clear();
		System.out.println(l2);
		
		boolean b3=l2.contains("Java");
		System.out.println(b3);
		
		
	}

}
