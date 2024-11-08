package methods;

public class Method3 {
	String name;       //GLobal non static variables
	String address;
	long mobileNumber;
	int passoutYear;
	float percentage;
	String instituteName;
	String courseName;
	String courseType;
	String facultyName;
	String batchTime;
	
	protected void studentDetails() {  //Non static method ---> studentDetails, instituteDetails, allDetails
		name = "Pranav Rothe";
		address = "Tilakwadi, Yavatmal, Maharashtra";
		mobileNumber = 9527213096l;
		passoutYear = 2022;
		percentage = 85.96f;	
		System.out.println("====>>>> Student Information <<<<====");
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
		System.out.println("Mobile Number: " +mobileNumber);
		System.out.println("Passout Year: " +passoutYear);
		System.out.println("Percentage: " +percentage);
	}
	public void instituteDetails() {
		instituteName = "Velocity Corporate Training Center";
		courseName = "Software Testing";
		courseType  = "Manual & Automation Testing";
		facultyName = "Mangesh Sir & Ranjeet Sir";
		batchTime = "7pm to 9pm";
		System.out.println("====>>>> Institute Information <<<<====");
		System.out.println("Name: " +instituteName);
		System.out.println("Course Name: " +courseName);
		System.out.println("Course Type: " +courseName);
		System.out.println("Faculty Name: " +facultyName);
		System.out.println("Batch Time: " +batchTime);
	}
	public void allDetails() {
		studentDetails();
//		instituteDetails();
//		System.out.println("====>>>> Student Information <<<<====");
//		System.out.println("Name: " +name);
//		System.out.println("Address: " +address);
//		System.out.println("Mobile Number: " +mobileNumber);
//		System.out.println("Passout Year: " +passoutYear);
//		System.out.println("Percentage: " +percentage);
//		System.out.println();
//		System.out.println("====>>>> Institute Information <<<<====");
//		System.out.println("Name: " +instituteName);
//		System.out.println("Course Name: " +courseName);
//		System.out.println("Course Type: " +courseName);
//		System.out.println("Faculty Name: " +facultyName);
//		System.out.println("Batch Time: " +batchTime);
	}

	public static void main(String[] args) {
		Method3 m3 = new Method3();
		m3.allDetails();
	}

}
