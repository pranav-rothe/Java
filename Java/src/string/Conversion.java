package string;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aBcDeF";
		System.out.println("Original String: "+str);

		char[] c = str.toCharArray();

		for (int i = 0; i <= str.length() - 1; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				c[i] = (char)(c[i] + 32);
			}
			else if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char)(c[i] - 32);
			}
		}
		String s = new String(c);
		System.out.println("New String: "+s);
	}

}

