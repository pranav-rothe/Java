package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {

		/*
		 * Order of insertion not maintained
		 * Only one null key and multiple null value are allowed
		 * Stores in key and value pair
		 * It is not thread-safe also called as non-synchronized
		 */
		HashMap<Integer, String> emp=new HashMap<>(); 
		HashMap<Integer, String> emp1=new HashMap<>(); 
		
		emp.put(01, "Dhoni");
		emp.put(02, "Virat");
		emp.put(03, "Rohit");
		emp.put(04, "Bumrah");
		emp.put(05, "Pant");				
		System.out.println(emp);
		System.out.println(); //adding a new line
		
		System.out.println("//Only one null key allowed");
		emp.put(null, null); //adding both key and value are null.
		System.out.println(emp);
		
		System.out.println(); //new line
		System.out.println("//Adding another null key but value is not null then its overrided on null key and value");
		emp.put(null, "NullKey"); //if we adding one key null and value is not empty then it overrided
		System.out.println(emp);
		
		System.out.println();//new line
		System.out.println("//In HashMap we can add multiple null values");
		emp.put(06, null);
		emp.put(07, null);
		System.out.println(emp);
		
		System.out.println();//new line
		System.out.println("//Get the size of hashmap");
		System.out.println(emp.size()); //it return int dataType and return a size of hashmap
		
		System.out.println();//new line
		System.out.println("//It returns string dataType and return a value of that key");
		System.out.println(emp.get(02));//it return String dataType and it return value of that key.
		
		System.out.println();//new line
		System.out.println("//It returns boolean dataType and return key is present or not");
		System.out.println(emp.containsKey(01)); //true
		System.out.println(emp.containsKey(11)); //false
		
		System.out.println();//new line
		System.out.println("//It returns boolean dataType and return value is present or not");
		System.out.println(emp.containsValue("Rohit")); //true
		System.out.println(emp.containsValue("Siraj")); //false
		
		System.out.println();//new line
		System.out.println("//It returns a set integer or we can say returns set of keys");
		System.out.println(emp.keySet()); //return a set on integer
		
		System.out.println();//new line
		System.out.println("//It returns a collection of String or we can say returns collection of values");
		System.out.println(emp.values());
		
		System.out.println();//new line
		System.out.println("//It returns a boolean dataType and returns are present or not");
		System.out.println(emp.isEmpty());//false
		System.out.println(emp1.isEmpty());//true
		
		System.out.println();//new line
		System.out.println("//keys iterated");
		for(Object k:emp.keySet()) { //get all keys by using keySet method
			System.out.println(k);
		}
		
		
		System.out.println();//new line
		System.out.println("//values iterated");
		for(Object v:emp.values()) { //get all values by using values method
			System.out.println(v);
		}

		System.out.println();//new line
		System.out.println("//Key and values iterated");
		for(Object kv:emp.keySet()) {
			System.out.println(kv+" "+emp.get(kv));
		}
		
		System.out.println();//new line
		System.out.println("//Using Map key and values iterated");
		for(Map.Entry<Integer, String> entry: emp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println();//new line
		System.out.println("//Using Iterator key and values iterated");
		Set<Entry<Integer, String>> s=emp.entrySet(); //return set of entry
		Iterator<Entry<Integer, String>> it=s.iterator(); //return iterator of entry
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
