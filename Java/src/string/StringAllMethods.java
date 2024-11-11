package string;

import java.util.Arrays;

public class StringAllMethods {

	public static void main(String[] args) {

		String a="Software Testing";
		String a1="";//This string is Empty
		String a2="            ABCD                     ";
		String a3="            ";//This string is blank
		String a4="Pranav";

		int x=a.length();
		System.out.println(x);

		String y=a.concat(" Automation");
		System.out.println(y);

		char c=a.charAt(2);
		System.out.println(c);

		int i=a.indexOf('e');
		System.out.println(i);

		int str=a4.indexOf("P");
		System.out.println(str);

		int l=a.lastIndexOf('e');
		System.out.println(l);

		boolean b=a3.isEmpty();
		System.out.println(b);

		String t=a2.trim();//removing a white-spaces
		System.out.println(t);

		boolean c1=a.contains("x");	
		System.out.println(c1);

		boolean b1=a1.isBlank();
		System.out.println(b1);

		String r=a.replace('f', 'o');
		System.out.println(r);

		String str1=a4.replace("Pranav", "Rothe");
		System.out.println(str1);

		String arr[]=a.split(" ");
		System.out.println(Arrays.toString(arr));

		for(int j=0;j<=arr.length-1;j++) {
			System.out.println(arr[j]);
		}

		String u=a.toUpperCase();
		System.out.println(u);

		String l1=a.toLowerCase();
		System.out.println(l1);

		boolean w=a.startsWith("S");
		System.out.println(w);

		boolean g=a.endsWith("x");
		System.out.println(g);

		String n=a.substring(0,4);
		System.out.println(n);

		String o=a.replace("w", "");
		System.out.println(o);

		char cx[]=a.toCharArray();
		Arrays.sort(cx);
		System.out.println(cx);

	}

}
