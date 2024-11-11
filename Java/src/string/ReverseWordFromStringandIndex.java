package string;

import java.util.Arrays;

public class ReverseWordFromStringandIndex {

	public static void main(String[] args) {
		String s="My name is Pranav Rothe";
		String c="";
		System.out.println(s);
		
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str)); //[My, name, is, Pranav, Rothe]
		
		int len=str.length-1; //length of string by using length method
		System.out.println(len);
		
		
		for(int i=len;i>=0;i--){ //reverse the whole string after remove the spaces
			String x=str[i];    //get each reverse word stored in temporary string x.
			for(int j=x.length()-1;j>=0;j--) { //for reversing a each word of character or index
				char ch=x.charAt(j);
				c+=ch; //c=c+ch
			}
			c+=" "; //c=c+" "
		}
		System.out.println();
		System.out.println(c+" ");
		
	}

}
