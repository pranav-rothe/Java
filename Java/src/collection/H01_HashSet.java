package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class H01_HashSet {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("Pranav");
		h.add("Aman");
		h.add("Java");
		h.add(251);
		h.add(true);
		h.add(false);
		h.add(65.32);
		
		for(Object o:h) {
			System.out.print(o+" ");
		}
		
		System.out.println();
		
		ArrayList a=new ArrayList(h);
		
		//List l=a.reversed();
		System.out.println(a.reversed());	

	}

}
