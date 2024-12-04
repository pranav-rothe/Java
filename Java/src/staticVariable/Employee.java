package staticVariable;

public class Employee {

	public static void main(String[] args) {

		StaticVariable s1=new StaticVariable();

		s1.empID=101;
		s1.empName="Elon";
		StaticVariable.ceo="Ratan Tata"; //static create one copy for whole class

		StaticVariable s2=new StaticVariable();

		s2.empID=201;
		s2.empName="Mark";
		StaticVariable.ceo="Ratan Tata";

		StaticVariable s3=new StaticVariable();

		s3.empID=301;
		s3.empName="Rohit";
		StaticVariable.ceo="Jamshedji Tata"; //JVM check a last static value is and update all the value
		
		s1.empInfo();
		s2.empInfo();
		s3.empInfo();
		
		methodOne();
		
	}
	
	public static void methodOne() {
		System.out.println("Java");
	}

}
