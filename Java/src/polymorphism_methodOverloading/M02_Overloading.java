package polymorphism_methodOverloading;

public class M02_Overloading {

	String fname;
	String lname;
	int ID;
	long mobNum;
	
	public static void main(String[] args) {
		
		M02_Overloading x=new M02_Overloading("TCS");
		x.mOne("Pranav", "Rothe");
		x.mOne(18, 9527213096l);		
		
	}
	
	public M02_Overloading(String companyName) {
		System.out.println(companyName);
	}
	
	public void mOne(String first,String last) {
		fname=first;
		lname=last;
		System.out.println(fname+" "+lname);
	}
	
	public void mOne(int i, long j) {
		ID=i;
		mobNum=j;
		System.out.println(ID+" "+mobNum);
	}
	

}
