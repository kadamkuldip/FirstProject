package demo9_2_Constructor_PassObjectToConstructor;

public class Student {

	int sid;
	String name;
	String course;
	
	Address address;

	public Student(int sid, String name, String course, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.address = address;
	}
}
