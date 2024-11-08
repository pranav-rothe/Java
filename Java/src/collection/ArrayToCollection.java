package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayToCollection {

	public static void main(String[] args) {
		
		String str[]= {"Pranav", "Aman", "Kartik", "Virat", "Aman", "Pranav","Virat"};
		
		System.out.println();
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(str));
		
		System.out.println("ArrayList: "+al);
		
		HashSet<String> hs=new HashSet<String>(Arrays.asList(str));
		
		System.out.println("Hashset: "+hs);

	}

}
