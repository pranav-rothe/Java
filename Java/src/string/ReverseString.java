package string;

public class ReverseString {

	public static void main(String[] args) 
	{
		String input = "Hello";
		String reversed = "";

		//Loop through the string in reversing order
		System.out.println("Original String: " +input);

		int len=input.length()-1;
		System.out.println(len);
		
		for(int i = 0; i<=len; i++)
		{ 			
			reversed = input.charAt(i)+reversed;
			//0=H+0;
			//H=e+H;
			//eH=l+eH;
			//leh=l+leh;
			//lleh=o+lleh
			//olleH
		}

		System.out.println("Reversed String: " +reversed);
		//The reversed string is then printed.
	}

}

/*
Explanation:

input.length() - 1 starts from the last character of the string.

We loop backwards through the string and keep appending characters to reversed.

input.charAt(i) gives the character at the i-th index.

The reversed string is then printed.
 */
