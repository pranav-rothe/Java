package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<=8;i++) {
			al.add(i);
		}
		System.out.println("ArrayList: "+al);
		
		System.out.println("---->>>>Iterator<<<<----");
		
		Iterator<Integer> itrOne= al.iterator();
		
		while(itrOne.hasNext()) {
			Integer i=itrOne.next();
			System.out.print("Itr: "+i+", ");
		}
		System.out.println();
		
		System.out.println("---->>>>ListIterator<<<<----");
		
		ListIterator<Integer> itr= al.listIterator();
		
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.print("L-Itr: "+i+", ");
			
			if(i%2!=0) 
				itr.remove();			
		}
		System.out.println();
		System.out.println("After removing ArrayList: "+al);
		
		while(itr.hasPrevious()) {
			Object i=itr.previous();
			System.out.print("L-Itr: "+i+", ");
		}
		
		Collection<String> collection=new ArrayList<String>();
		collection.add("Red");
		collection.add("Blue");
		collection.add("green");
		collection.add("yellow");
		collection.add("orange");
		collection.add("black");
		collection.add("pink");
		
		System.out.println();
		
		Iterator<String> itr2=collection.iterator();
		while(itr2.hasNext()) {
			Object str=itr2.next().toUpperCase();
			System.out.print(str +" ");
		}
		
		
		
	}

}
