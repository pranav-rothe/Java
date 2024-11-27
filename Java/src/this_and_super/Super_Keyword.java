package this_and_super;

public class Super_Keyword extends This_Keyword{

	int num=5000;
	String s="Automation";
	
	public static void main(String[] args) {
		
		Super_Keyword s=new Super_Keyword();
		s.mOne();
	}
	
	public void mOne() {
		int num=2000;
		String s="Java";
		
		System.out.println(num); //local variable 
		System.out.println(s);
		
		System.out.println(this.num); //global variable accessing by this keyword
		System.out.println(this.s);
		
		System.out.println(super.num);  //parent class variable accessing by super keyword
		System.out.println(super.s);
	}

}
