package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable2 {

	public static void main(String[] args) {

		Hashtable<Integer, String> emp=new Hashtable<>();
		emp.put(1, "Smith");
		emp.put(2, "Jack");
		emp.put(3, "John");
		emp.put(4, "Travis");
		emp.put(5, "Pat");
		
		System.out.println(emp); //{5=Pat, 4=Travis, 3=John, 2=Jack, 1=Smith}
		
		System.out.println(); //new line
		System.out.println("//get value of that key");
		System.out.println(emp.get(4));
		
		System.out.println(); //new line
		System.out.println("//get size");
		System.out.println(emp.size()); //5
		
		System.out.println(); //new line
		System.out.println("//get contains key present or not");
		System.out.println(emp.containsKey(5)); //true
		System.out.println(emp.containsKey(10)); //false
		
		System.out.println(); //new line
		System.out.println("//get contains value present or not");
		System.out.println(emp.containsValue("Pat")); //true
		System.out.println(emp.containsValue("Virat")); //false
		
		System.out.println(); //new line
		System.out.println("//check hashtable is empty or not");
		System.out.println(emp.isEmpty()); //false
		Hashtable<String, String> h=new Hashtable<>();
		System.out.println(h.isEmpty()); //true
		
		System.out.println(); //new line
		System.out.println("//get all keys");
		System.out.println(emp.keySet()); //[5, 4, 3, 2, 1]
		
		System.out.println(); //new line
		System.out.println("//get all values");
		System.out.println(emp.values()); //[Pat, Travis, John, Jack, Smith]
		
		System.out.println(); //new line
		System.out.println("//get all keys and values by using entryset");
		System.out.println(emp.entrySet()); //[5=Pat, 4=Travis, 3=John, 2=Jack, 1=Smith]
		
		System.out.println(); //new line
		System.out.println("//by enumeration");
		Enumeration<String> e=emp.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println(); //new line
		System.out.println("//get keys and values by Map");
		for(Map.Entry<Integer, String> entry:emp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println(); //new line
		System.out.println("//get keys by iterate");
		for(Object keys:emp.keySet()) {
			System.out.println(keys);
		}
		
		System.out.println(); //new line
		System.out.println("//get values by iterate");
		for(Object values:emp.values()) {
			System.out.println(values);
		}
		
		System.out.println(); //new line
		System.out.println("//get keys and values");
		for(Object kv:emp.keySet()) {
			System.out.println(kv+" "+emp.get(kv));
		}
		
		System.out.println(); //new line
		System.out.println("//get keys and values by using iterator");
		Iterator<Entry<Integer, String>> it=emp.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
