package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_To_ArrayList {

	public static void main(String[] args) {

		LinkedList city=new LinkedList<>();
		city.add("Pune");
		city.add("Yavatmal");
		city.add("Nagpur");
		city.add("Ahemdabad");
		city.add("Amravati");
		city.add("Shegaon");
		
		System.out.println("LinkedList: "+city);
		
		ArrayList al=new ArrayList<>(city);//LinkedList converted into ArrayList
		
		System.out.println("ArrayList: "+al);
		
		System.out.println(al.size());
		
		al.addFirst("Vardha");
		System.out.println(al);
		
		
		
		
		
		
		
		
		
	}

}
