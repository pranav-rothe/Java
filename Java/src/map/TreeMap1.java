package map;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap hm=new TreeMap<>();
		hm.put("Pranav", 'p');
		hm.put("Aman", 'a');
		hm.put("Ram", 'r');
		hm.put("Virat", 'v');
		//hm.put(null, 'n');
		//hm.put(null, 5);
		hm.put("A",null);
		hm.put("B", null);
		//hm.put(1, "String");
		
		System.out.println(hm);
	}

}
