package string;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		String s = "aabbccdd";	
		String op ="";

		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			System.out.println(c);
			String str =  String.valueOf(c); //here we put string because we cannot compare string & character

			if(!op.contains(str))//here we use ! for making condition true
			{
				op+=str; 
			}

		}
		System.out.println(op);
	}

}
