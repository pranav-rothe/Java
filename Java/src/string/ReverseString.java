package string;

public class ReverseString {

	public static void main(String[] args) 
	{
		String input = "Hello";
		String reversed = "";

		//Loop through the string in reversing order
		System.out.println("Original String: " +input);

		//for(int i = input.length()-1; i>=0; i--)
		for(int i = 0; i<=input.length()-1;i++)
		{ 
			//input.length() - 1 starts from the last character of the string.
			
			reversed = input.charAt(i)+reversed;
			//reversed +=input.charAt(i);

			//input.charAt(i) gives the character at the i-th index.
			//Append each character to the new string		
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
