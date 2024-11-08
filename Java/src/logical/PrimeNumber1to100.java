package logical;

public class PrimeNumber1to100
{

	public static void main(String[] args) 
	{
		int num = 100;

		for(int i=1;i<=num;i++) 
		{
			int count = 0;
			
			for(int j=1;j<=num;j++) 
			{
				if(i%j==0) 
				{
					count++;//it increases when if condition is true.
				}			
			}
			if(count==2)//here we 2 because the prime is divisible by 1 and itself that's why count is 2.
			{
				System.out.println(i+ " prime number");
			}			

		}

	}

}
