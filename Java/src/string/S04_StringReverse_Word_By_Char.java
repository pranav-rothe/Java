package string;

import java.util.Arrays;

public class S04_StringReverse_Word_By_Char {

	public static void main(String[] args) {

		String s1= "Hi good evening";
		          //iH doog gingneve
				  //gingneve doog iH
		String s2="";

		String words[]=s1.split(" ");

		for(String word : words) {
			String revWords="";
			for(int i=word.length()-1;i>=0;i--) {
				revWords=revWords+word.charAt(i);
			}
			s2=revWords+" ";
			System.out.print(s2);
		}
		
	}
}
