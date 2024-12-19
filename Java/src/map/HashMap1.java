package map;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		//It is a key,value combination
		//HashMap accept one null "key" and accept multiple null "value"
		HashMap hm=new HashMap<>();
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
