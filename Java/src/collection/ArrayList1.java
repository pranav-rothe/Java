package collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(101);
		al.add(102.25);
		al.add("Pranav");
		al.add('R');
		
		System.out.println("Size of Array: " +al.size());
		System.out.println(al);
		
		for(Object x: al) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		al.remove(3);
		System.out.println(al);
		
		al.add(1, "Rothe");
		System.out.println(al);
		
		al.set(1, 952);
		System.out.println(al);
		
		al.addFirst(2024);
		System.out.println(al);
		
		al.addLast("Rothe");
		System.out.println(al);
		
		System.out.println(al.contains("Pranav"));
		
		System.out.println(al.isEmpty());
		
		al.add(3, "Aman");
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.getFirst()+ " " +al.getLast());
		
		al.clear();
		System.out.println(al);
		
		boolean b=al.isEmpty();
		System.out.println(b);
	

	}

}
