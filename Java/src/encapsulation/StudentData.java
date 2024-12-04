package encapsulation;

import java.util.ArrayList;

public class StudentData {

	public static void main(String[] args) {
		
		//simple approach
		Student s=new Student("Pranav", "selenium@gmail.com", 101);
		s.getAllData();
		
		
		//By using Collection
		ArrayList<Student> a=new ArrayList<>();
		a.add(new Student("MS", "dhoni@gmail.com", 7));
		a.add(new Student("Virat", "kohli@gmail.com", 18));
		
		for(Student s1:a) {
			s1.getAllData();			 
		}

	}

}
