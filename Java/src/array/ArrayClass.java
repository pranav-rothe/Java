package array;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;	
		
		String str=Arrays.toString(a); //Representation of array by using to string
		System.out.println(str);
		
		int in=a.length;
		System.out.println(in);
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int x: a) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		int b[]= {101, 201, 301, 401, 501};
		for(int y: b) {
			System.out.print(y+" ");
		}
		
		System.out.println();
		
		String str1=Arrays.toString(b);
		System.out.println(str1);
		
		System.out.println();
		
		for(int j=0;j<=b.length-1;j++) {
			System.out.print(b[3]+" ");
		}
		
	}

}
