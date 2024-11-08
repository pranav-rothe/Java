package methods;

public class Method4 {

	int a=20;
	int b=10;

	public int add() {	//integer return type method with zero parameter
		int c=a+b; 
		return c;
	}

	public void add(int num1, int num2) {	//void- does not have any return type with two parameter method
		a=num1;
		b=num2;
		int c=a+b;
		System.out.println("Two para and void add method: "+c);
	}

	public static void main(String[] args) {
		Method4 m = new Method4();
		int x=m.add();
		System.out.println("Zero para and int returnType add method: "+x);
		m.add(30, 30);

	}

}
