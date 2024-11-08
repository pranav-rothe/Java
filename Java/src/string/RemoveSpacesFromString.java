package string;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		
		String s="My name is Pranav Rothe";
		String c="";
		
		for(char x:s.toCharArray()) {
			if(x!=' ') {
				c+=x;
			}
		}
		System.out.println(c);
	}

}
