package string;

public class ReverseWordFromString {

	public static void main(String[] args) {
		String s="My name is Pranav Rothe";
		String c="";
		System.out.println("Original String: " +s);
		
		String str[] = s.split(" ");
		
		for(int i=str.length-1;i>=0;i--){ //reverse the whole string after remove the spaces
			String x=str[i];//get each word in temporary string x.
			
			for(int j=x.length()-1;j>=0;j--) { //for reversing a word or index
				char ch=x.charAt(j);
				c+=ch;
			}
			c+=" ";
		}
		System.out.println("Reversed String and reversed a word: "+c);
		
	}

}
