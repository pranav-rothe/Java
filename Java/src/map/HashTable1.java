package map;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {

		
		//hashtable not accept any key and value null.
		//hashtable insertion order not maintained
		Hashtable ht=new Hashtable<>();
		ht.put('A', 1);
		ht.put('B', 2);
		ht.put('C', 3);
		ht.put('D', 4);
		ht.put('D', 5);
		
		System.out.println(ht);
		
		
		
	}

}
