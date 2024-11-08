package constructor;

public class Constructor1 
{
	String name;
	int rollNumber;
	public Constructor1(int x, int y)
	{
		int z=x+y;
		System.out.println("Addition: "+z);
	}
	public Constructor1(String n, int rn)
	{
		name=n;
		rollNumber=rn;
	}
	public void Constructor1()
	{
		System.out.println("Creating a same class name of method name it allowed but give one warning");
	}
	public void add(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction: "+c);
	}

	public static void main(String[] args) 
	{
		Constructor1 c1=new Constructor1(50, 50);
		Constructor1 c2=new Constructor1("Pranav", 10);
		c2.Constructor1();
		c2.add(100,25);
	}

}
