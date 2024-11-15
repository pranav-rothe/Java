package string;

import java.util.Arrays;

public class S03_ReverseString_with_word {

	public static void main(String[] args) {
		
		String s1="Dog is a pet animal";
		String s2="";
		
		String s3[]=s1.split(" ");
		
		int len=s3.length-1;
		System.out.println(len);
		
		for(int i=len;i>=0;i--) {
			System.out.print(s3[i]+" ");
		}
		
		
	}

}
