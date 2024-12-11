package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		//1. add
		al.add("Java");
		al.add(98);
		al.add(16.54f);
		al.add(true);
		al.add('S');
		al.add("Automation");
		
		System.out.println("1. "+al);
		
		//2. addFirst
		al.addFirst("Selenium");
		System.out.println("2. "+al);
		
		//3. addLast
		al.addLast("TestNG");
		
		System.out.println("3. "+al); //added first and last element
		
		//4. get 
		Object obj=al.get(5);
		System.out.println("4. "+obj);
		
		//5. getFirst
		Object first=al.getFirst();
		System.out.println("5. "+first);
		
		//6. getLast
		Object second=al.getLast();
		System.out.println("6. "+second);
		
		//7. isEmpty
		boolean b1=al.isEmpty();
		System.out.println("7. "+b1);
		
		//8. remove
		Object obj1=al.remove(3);
		System.out.println("remove element: "+obj1);
		System.out.println("8. "+al);
		
		//9. set
		al.set(3, "'Set'");
		System.out.println("9. "+al);
		
		//10. size
		int len=al.size();
		System.out.println("10. "+len);
		
		//11. reversed 
		System.out.println("11. "+al.reversed());
		
		//12. sort (Ascending order)
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
	}

}
