package list;


import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList<Integer> l=new LinkedList<>();
		l.add(301);
		l.add(102);
		l.add(90);
		l.add(500);
		l.add(230);
		l.add(150);
		l.add(102);
		
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		
		int first=l.getFirst();
		System.out.println(first);
		
		int last=l.getLast();
		System.out.println(last);
		
		int getIndex=l.get(5);
		System.out.println(getIndex);
		
		l.addFirst(450);
		System.out.println(l);
		
		l.addLast(100);
		System.out.println(l);
		
		System.out.println(l.size());
		
		l.set(3, 900);
		System.out.println(l);
		
		System.out.println();
		ListIterator<Integer> lt=l.listIterator();
		while(lt.hasNext()) {
			int num=lt.next();
			System.out.println(num);
			
		}
		
		System.out.println();
		while(lt.hasPrevious()) {
			int num=lt.previous();
			System.out.println(num);
		}
		System.out.println();
		
		Collections.sort(l);
		System.out.println(l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		
		System.out.println();
		System.out.println();
			
		
		
		
	}
	
	

}
