package list;

import java.util.LinkedList;

public class LinkedList_To_Array {

	public static void main(String[] args) {

		LinkedList<String> f=new LinkedList<>();
		f.add("Mango");
		f.add("Watermelon");
		f.add("Banana");
		f.add("Kiwi");
		f.add("Apple");
		f.add("Orange");
		f.add("Pineapple");
		
		System.out.println(f);
		
		String[] arr=f.toArray(new String[0]);
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		String[] str=new String[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			str[i]=arr[i];
		}
		
		int size=str.length-1;
		System.out.println(size);
		
		
	}

}
