package set;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet hs=new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("C");
		hs.add("E");
		hs.add("F");
		
		System.out.println(hs);
		System.out.println(hs.add("A"));
		
		hs.add("A");
		System.out.println(hs);
		
		hs.add(null);
		System.out.println(hs);
		
		hs.add("Cars");
		System.out.println(hs);
		
		System.out.println(hs.size());
	}

}
