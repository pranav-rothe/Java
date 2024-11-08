package string;

public class Palindrome {

	public static void main(String[] args) 
	{
		String input = "madam";
		System.out.println("Input String: " +input);

		//Use a StringBuilder to reverse the string
		String reversed = new StringBuilder(input).reverse().toString();

		//Compared original and reversed string
		if(input.equals(reversed)) {
			System.out.println(input+ " is a palindrome.");
		}
		else {
			System.out.println(input+ " is not a palindrome.");
		}
	}

}

/*
Explanation:

StringBuilder(input).reverse().toString() reverses the string.

input.equals(reversed) checks if the original string matches the reversed one.

If they match, it's a palindrome, otherwise it's not.
 */
