package collection;

import java.util.ArrayList;

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
		
		System.out.println(al);
		
		//clear all the element to the collection
		//al.clear();
		//System.out.println(al);
		
		Object x=al.get(4);
		System.out.println(x);
		
		
	}

}
