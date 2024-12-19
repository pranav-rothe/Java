package map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		//It maintains a order of insertion
		LinkedHashMap hm=new LinkedHashMap<>();
		hm.put("Pranav", 'p');
		hm.put("Aman", 'a');
		hm.put("Ram", 'r');
		hm.put("Virat", 'v');
		hm.put(null, 'n');
		hm.put(null, 5);
		hm.put("A",null);
		hm.put("B", null);
		hm.put(1, "String");
		
		System.out.println(hm);
	}

}
