package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSet_To_ArrayList {

	public static void main(String[] args) {

		HashSet<String> month=new HashSet<>();
		month.add("March");
		month.add("August");
		month.add("January");
		month.add("December");
		
		ArrayList<String> al=new ArrayList<>(month);
		System.out.println(al);
		
		al.add(0, "May");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println(al.getFirst());
	}

}
