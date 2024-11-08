
public class Hello1 {

	public static void main(String[] args) {
		String name="Pranav";
		String temp="";
		for(int i=0;i<name.length();i++) {
			temp=name.charAt(i)+temp;
		}
		System.out.println(temp);

	}

}
