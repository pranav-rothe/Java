package set;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {

		LinkedHashSet<String> name=new LinkedHashSet<>();
		name.add("Aman");
		name.add("Tejas");
		name.add("Kiran");
		name.add("Ashlesha");
		name.add("Anuja");
		name.add("Isha");
		name.add("Reema");
		
		System.out.println(name);
		
		System.out.println(name.add("Isha"));
		
		name.add(null);
		System.out.println(name);
		
		boolean b=name.contains("Tejas");
		System.out.println(b);
		
		name.addFirst("Ketan");
		name.addLast("Rohit");
		
		System.out.println(name);
		
		name.remove(null);
		System.out.println(name);
		
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
		
		System.out.println(name.isEmpty());
		
	}

}
