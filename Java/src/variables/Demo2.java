package variables;

public class Demo2 {

	public static void main(String[] args) {
		// Variable Declaration
		String InstituteName;
		String CourseName;
		String FirstName;
		String Lastname;
		String MailID;
		int PassoutYear;
		int RollNumber;
		char StudentGrade;
		float Percentage;
		
		//Variable initialization
		InstituteName = "Velocity Corporate Training Center";
		CourseName = "Software Testing";
		FirstName = "Pranav";
		Lastname = "Rothe";
		MailID = "pranavrothe96@gmail.com";
		PassoutYear = 2022;
		RollNumber = 42;
		StudentGrade = 'A';
		Percentage = 86.92f;
		
		//Usage & String Concatenation
		System.out.println("======>>>> Stundent Details for Institute <<<<======");
		System.out.println("Institute Name: " +InstituteName);
		System.out.println("Course Name: " +CourseName);
		System.out.println("Firstname: " +FirstName);
		System.out.println("Lastname: " +Lastname);
		System.out.println("Mail ID: " +MailID);
		System.out.println("Passout Year: " +PassoutYear);
		System.out.println("Roll Number: " +RollNumber);
		System.out.println("Grade: " +StudentGrade);
		System.out.println("Percentage: " +Percentage+"%");
	}

}
