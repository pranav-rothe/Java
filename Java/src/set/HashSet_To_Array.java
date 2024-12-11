package set;

import java.util.HashSet;

public class HashSet_To_Array {

	public static void main(String[] args) {

		HashSet<String> month=new HashSet<>();
		month.add("March");
		month.add("August");
		month.add("January");
		month.add("December");
		
		String[] arr2=month.toArray(new String[0]);
		
	}

}
