package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertCollectionToCollection {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add("Aman");
		a.add("Pranav");
		a.add(45);
		a.add(18);
		a.add('A');
		a.add(true);
		a.add(false);
		a.add("Aman");
		a.add("Pranav");
		a.add(45);
		a.add(18);
		
		System.out.println(a);
		
		HashSet hs=new HashSet(a);
		System.out.println(hs);	
	}

}
