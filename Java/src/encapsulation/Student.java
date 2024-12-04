package encapsulation;

public class Student {

	private String name;
	private String email;
	private int ID;

	public Student(String name, String email, int ID) {
		this.name=name;
		this.email=email;
		this.ID=ID;		
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getID() {
		return ID;		
	}

	public void getAllData() {
		System.out.println(name+" "+email+" "+ID);
	}

}
