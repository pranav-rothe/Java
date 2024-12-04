package string;

public class RemoveStringSpecialChar {

	public static void main(String[] args) {
		String s1="i @ am % pranav * rothe";
		String str=s1.replaceAll("\\W",""); // "\\W" --> removes special character 
		String specChar=s1.replaceAll("\\w",""); // "\\w" --> removes string character
		System.out.println(str);
		System.out.println(specChar);
		

	}

}
