package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A01_ArrayList {

	public static void main(String[] args) {

		//Not a generic arrayList so it can store all types dataTypes value
		ArrayList al=new ArrayList();

		//adding a element in collection 
		al.add(10);
		al.add("Pranav");
		al.add(null);
		al.add(65.32);
		al.add(true);
		al.add("Pranav");
		al.add("element");

		System.out.println(al);

		//clear all the element to the collection
		//al.clear();
		//System.out.println(al);

		Object x=al.get(6); //which value on that index we can get
		System.out.println(x);
		
		int i=al.indexOf("Pranav");
		System.out.println(i);
		

		al.addFirst("addFirst"); //add a element in first position
		System.out.println(al); 

		al.addLast("addLast"); //add a element in second position
		System.out.println(al);


		System.out.println(al.contains(65.32)); //true

		System.out.println(al.getFirst()); //first element printed or displayed
		System.out.println(al.getLast()); //last element printed or displayed

		System.out.println(al.size()); //get list size

		System.out.println(al.indexOf(65.32)); //get a particular index of that element

		System.out.println(al.isEmpty()); //check that is the list is empty or not


		List rev=al.reversed(); //reverse print a array
		System.out.println(rev);

		System.out.println(al.set(6, 100)); //replace the element on 6th index there is pranav now is 100
		System.out.println(al);

		System.out.println("=========================================");
		Iterator itr=al.iterator();

		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.print(o+" ");
		}
		System.out.println();

		System.out.println("===========List Iterator==============");
		ListIterator ltr=al.listIterator();

		while(ltr.hasNext()) {
			Object l=ltr.next();
			System.out.print(l+" ");
		}

		System.out.println();

		System.out.println("=========================================");
		
		while(ltr.hasPrevious()) {
			Object e=ltr.previous();
			System.out.print(e+" ");
		}
		
		Object arr[]=al.toArray();
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2= {10, 20, 30};
		
		List l1=Arrays.asList(arr2);
		System.out.println(l1);
		
		
		
		
		

	}

}
