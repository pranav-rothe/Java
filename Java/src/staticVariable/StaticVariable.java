package staticVariable;

public class StaticVariable {

	public int empID;
	public String empName;
	
	static String ceo;  //static variable
	
	public void empInfo() {
		System.out.println(empID+" "+ empName+" "+ceo);
		
	}

}
