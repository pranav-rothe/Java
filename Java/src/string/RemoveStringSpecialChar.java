package string;

public class RemoveStringSpecialChar {

	public static void main(String[] args) {
		String s1="i @ am % pranav * rothe";
		String a=s1.replaceAll("\\w",""); // "\\W" --> removes special character 
		System.out.println(a);
		

	}

}
