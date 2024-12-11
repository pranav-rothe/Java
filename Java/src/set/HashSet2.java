package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {

		HashSet<String> month=new HashSet<>();
		month.add("March");
		month.add("August");
		month.add("January");
		month.add("December");
		
		System.out.println(month);
		
		boolean b1=month.contains("Feb");
		System.out.println(b1);
		
		boolean b2=month.isEmpty();
		System.out.println(b2);
		
		System.out.println();
		for(String str:month) {
			System.out.println(str);
		}
		
		System.out.println();		
		Iterator<String> it=month.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
		HashSet<String> month1=new HashSet<>();
		month1.add("March");
		month1.add("August");
		month1.add("January");
		month1.add("December");
		month1.add("April");
		
		System.out.println();
		boolean eq=month.equals(month1);
		System.out.println(eq);
	}

}
