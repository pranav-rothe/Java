package string;

import java.util.Arrays;

public class S07_StringCount {

	public static void main(String[] args) {
		
		//Initialize all the  variable with zero
		int digit=0;
		int chr=0;
		int space=0;
		int specialChar=0;
		
		String s="my name is Pranav 1234 @#$%^";
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
				chr++;
			}
			else if(ch>='0' && ch<='9') {
				digit++;
			}
			else if(ch==' ') {
				space++;
			}
			else {
				specialChar++;
			}			
		}
		System.out.println("Character: "+chr);
		System.out.println("Digit: "+digit);
		System.out.println("Space: "+space);
		System.out.println("Special Character: "+specialChar);
	}

}
