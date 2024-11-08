package collection;

import java.util.ArrayList;

public class CollectionToArray {

	public static void main(String[] args) {
		
//		ArrayList<String> al=new ArrayList<String>();
//		al.add("Pranav");
//		al.add("Aman");
//		al.add("Rishab");
//		al.add("Virat");
//		al.add("Rohit");
//		al.add("Tejas");
//		al.add("Aman");
//		al.add("TRUE");
//		
//		System.out.println(al);
//		
//		String str[]= new String[al.size()];
//		str=al.toArray(str);
//		System.out.println("Collection converted to Array");
//		for(String s: str) {
//			System.out.print(s+" ");
//		}
		
		ArrayList a=new ArrayList();
		a.add("Aman");
		a.add("Pranav");
		a.add(45);
		a.add(18);
		a.add('A');
		a.add(true);
		a.add(false);
		
		System.out.println(a);
		
		Object o[]=new Object[a.size()];
		o=a.toArray(o);
		for(Object x: o)
		{
			System.out.print(x+" ");			
		}
		
		Integer i[]=new Integer[a.size()];
		
		
		
		
	}

}
