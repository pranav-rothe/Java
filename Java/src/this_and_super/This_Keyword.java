package this_and_super;

public class This_Keyword {

	int num=55;
	String s="Pranav";

	public static void main(String[] args) {

		This_Keyword t=new This_Keyword();
		t.demo();


	}

	public void demo() {
		int num=41;     //if we create a variable inside the method with same name as a global variable
		String s="Aman";
		System.out.println(num);
		System.out.println(s);

		System.out.println(this.num); //Accessing a global variable by using this keyword inside the method
		System.out.println(this.s);
	}

}
