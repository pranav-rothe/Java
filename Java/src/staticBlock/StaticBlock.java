package staticBlock;

public class StaticBlock {
	
	//Static Block
	static {
		int a=20;
		System.out.println("Inside Static Block.");
		System.out.println("Static block value: "+a);
	}
	
	//Instance Block
	{
		System.out.println("Inside Instance Block."); //This block is called when the object is created.
		int b=50;
		System.out.println("Instance block value: "+b);
	}

	public static void main(String[] args) {
		
		System.out.println("Inside Main Block.");
		
		StaticBlock s=new StaticBlock();

	}

}
