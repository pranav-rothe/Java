package string;

public class S01_ReverseString {

	public static void main(String[] args) {
		
		String org="Hello";
		String rev="";
		
		int len=org.length()-1;
		System.out.println("Length: "+len);
		
		for(int i=len;i>=0;i--) {
			char c=org.charAt(i);
			rev+=c;
		}
		System.out.println(rev);
	}

}
