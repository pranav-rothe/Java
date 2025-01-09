package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {

	public static void main(String[] args) {

		HashMap<Integer, String> f=new HashMap<>();
		
		f.put(1, "Apple");
		f.put(2, "Mango");
		f.put(3, "Cherry");
		f.put(4, "Grapes");
		f.put(5, "Orange");
		
		System.out.println(f); //{1=Apple, 2=Mango, 3=Cherry, 4=Grapes, 5=Orange}
		
		System.out.println(); //new line
		System.out.println("//get key value");
		System.out.println(f.get(3)); //Cherry
		
		System.out.println(); //new line
		System.out.println("//get size");
		System.out.println(f.size()); //5
		
		System.out.println(); //new line
		System.out.println("//get keySet");
		System.out.println(f.keySet()); //[1, 2, 3, 4, 5]
		
		System.out.println(); //new line
		System.out.println("//get values");
		System.out.println(f.values()); //[Apple, Mango, Cherry, Grapes, Orange]
		
		System.out.println(); //new line
		System.out.println("//get key contains");
		System.out.println(f.containsKey(5)); //true
		System.out.println(f.containsKey(10)); //false
		
		System.out.println(); //new line
		System.out.println("//get value contains");
		System.out.println(f.containsValue("Watermelon")); //false
		System.out.println(f.containsValue("Apple")); //true
		
		System.out.println(); //new line
		System.out.println("//isEmpty");
		System.out.println(f.isEmpty()); //false
		
		System.out.println(); //new line
		System.out.println("//get entry set");
		System.out.println(f.entrySet()); //[1=Apple, 2=Mango, 3=Cherry, 4=Grapes, 5=Orange]
		
		System.out.println(); //new line
		System.out.println("//iterate keys");
		for(Object keys:f.keySet()) {
			System.out.println(keys);			
		}
		
		System.out.println(); //new line
		System.out.println("//iterate values");
		for(Object values:f.values()) {
			System.out.println(values);
		}
		
		System.out.println(); //new line
		System.out.println("//get keys and values"); 
		for(Object kv: f.keySet()) {
			System.out.println(kv+" "+f.get(kv));
		}
		
		System.out.println(); //new line
		System.out.println("//get keys and values using map");
		for(Map.Entry<Integer, String> m:f.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println(); //new line
		System.out.println("//get keys and values using iterator");
		Set<Entry<Integer, String>> set=f.entrySet();
		Iterator<Entry<Integer, String>> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(); //new line
		System.out.println("//another way to use iterator");
		Iterator<Entry<Integer, String>> i=f.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
