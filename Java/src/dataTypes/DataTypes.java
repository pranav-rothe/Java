package dataTypes;

public class DataTypes {

	public static void main(String[] args) {
		
		//DataType name byte (1 byte = 8 bit)
		//Syntax: dataType variableName = variableValue;		
		byte A1 = 126;		
		System.out.println("DataType byte = " +A1);
		
		//DataType name short ( 2 byte = 16 bit)
		//Syntax: dataType variableName = variableValue;		
		short A2 = 15942;
		System.out.println("DataType short = " +A2);
		
		//DataType name int (4 byte = 32 bit)
		//Syntax: dataType variableName = variableValue;		
		int A3 = 1234567890;
		System.out.println("DataType int = " +A3);
		
		//DataType name float (4 byte = 32 bit)
		//Syntax: dataType variableName = variableValue;		
		float A4 = 356.265f;
		System.out.println("DataType float = " +A4);
		
		//DataType name long (8 byte = 64 bit)
		//Syntax: dataType variableName = variableValue;		
		long A5 = 1234567890987654321l;
		System.out.println("DataType long = " +A5);
		
		//DataType name double (8 byte = 64 bit)
		//Syntax: dataType variableName = variableValue;		
		double A6 = 123456789.987654321d;
		System.out.println("DataType double = " +A6);
		
		//DataType name boolean (1 bit)
		//Syntax: dataType variableName = variableValue;		
		boolean A7 = true;
		System.out.println("DataType boolean 'true' = " +A7);
		
		boolean A8 = false;
		System.out.println("DataType boolean 'false' = " +A8);
		
		//DataType name char (2 byte = 16 bit)
		//Syntax: dataType variableName = variableValue;		
		char A9 = 'A';
		System.out.println("DataType char = " +A9);
		
		final int A10=2;
		System.out.println(A10);
		
//		A10=10;
		
		A3=1;
		System.out.println(A3);

	}

}
