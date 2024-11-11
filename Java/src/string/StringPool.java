package string;

public class StringPool {

	public static void main(String[] args) 
	{
		String p="Pranav"; //These are the litrals String
		String y="Pranav"; 
		String a="Aman";
		String x="Aman";
		
		String p1 = new String("Pranav");
		String y1 = new String("Pranav");
		String x1 = new String("Aman");
		String a1 = new String("Aman");
		
		if(p==y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}		
		
		String b=new String("Alex");
		String b1="Alex";
		
		String b2="Alex";
		

	}

}
/*
1. When we create a string literal, it’s stored in the string pool.
2. If there is already a string with the same value in the string pool, 
   then new string object is not created. The reference to the existing string object is returned.
3. Java String Pool is a cache of string objects. It’s possible because string is immutable.
4. If we create a string object using new operator, it’s created in the heap area. 
5. If we want to move it to the string pool, we can use intern() method.
*/
