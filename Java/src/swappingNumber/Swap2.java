//2. Swapping two numbers using two variables
//Input: A = 100, B = 200	Output: A = 200, B = 100

package swappingNumber;

public class Swap2
{
	public static void main(String[] args)
	{
		int A = 100;
		int B = 200;
		
		System.out.println("Before swapping value of A: " +A);
		System.out.println("Before swapping value of B: " +B);
		
		A = A+B;	// A = 100+200 =300
		B = A-B;	// B = 300-200 =100
		A = A-B;	// A = 300-100 =200
		
		System.out.println("===============================");
		
		System.out.println("After swapping value of A: " +A);
		System.out.println("After swapping value of B: " +B);
	}
}