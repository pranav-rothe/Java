//1. Swapping two numbers using two variables
//Input: A = 100, B = 200	Output: A = 200, B = 100

package swappingNumber;

public class Swap1
{
	public static void main(String[] args)
	{
		int A = 100; //dataType variableName = variableValue
		int B = 200;
		int temp;    //temp variable created to store a temporary value for swapping		
		
		System.out.println("Before swapping value of A: " +A);
		System.out.println("Before swapping value of B: " +B);

		temp = A;  //temp = 100 --> A is empty now. Temp store a value of A = 100
		A = B;     //A = 200 --> B is empty now. A store a value a value of B = 200
		B = temp;  //B = 100 --> Temp is empty now. B store a value of Temp = 100
		
		System.out.println("===============================");

		System.out.println("After swappinng value of A: " +A);
		System.out.println("After swapping value of B: " +B);
	}
}