package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSet_To_LinkedList {

	public static void main(String[] args) {
		
		HashSet<String> month=new HashSet<>();
		month.add("March");
		month.add("August");
		month.add("January");
		month.add("December");
		
		LinkedList<String> l=new LinkedList<>(month);
		System.out.println(l);
		
		System.out.println(l.get(2));
		

	}

}
