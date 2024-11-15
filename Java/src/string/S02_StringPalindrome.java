package string;

public class S02_StringPalindrome {

	public static void main(String[] args) {
		
		String s1="madam";
		String s2="";
		
		System.out.println(s1);
		int len=s1.length()-1;
		
		for(int i=len;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
