package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursors {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(101);
		al.add(102.25);
		al.add("Pranav");
		al.add('R');
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(425);
		al2.add(486);
		al2.add(786);
		al2.add(143);
		al2.add(101);
		al2.add(212);
		
		Iterator itr=al.iterator(); //Iterator interface has its own three methods like(hasNext() returns boolean, next() returns data, remove() returns void)
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<Integer> itr1 = al2.listIterator(al2.size());  //listIterator has also two methods like(hasPrevious(), previous())
				
//		itr1=al2.listIterator(); //listIterator has also two methods like(hasPrevious(), previous())
		
		while(itr1.hasPrevious()) {
			Integer i=itr1.previous();
			System.out.println(i);
		}
		
		
	}

}

/*
 initial capacity of ArrayList is 10 on runtime the memory get increases by 
 ((current_capacity*3)/2)+1
 ((10*3)/2)+1=16 
 */
