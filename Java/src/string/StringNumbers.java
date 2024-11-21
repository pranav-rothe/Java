package string;

public class StringNumbers {

	public static void main(String[] args) {

		String s="There is 10 pens and 10 rupees cost of each pen";

		String str[]=s.split(" ");

		int sum=0;

		for(int i=0;i<=str.length-1;i++) {
			if(str[i].matches("[0-9]+")) {
				int x=Integer.parseInt(str[i]);
				sum+=x;
			}
		}
		System.out.println(sum);

	}

}
