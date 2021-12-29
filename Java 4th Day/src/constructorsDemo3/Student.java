package constructorsDemo3;

public class Student {
	
	int id;
	String name;
	
	Student(int id, String name){
		System.out.println("==Parameterize Constructor==");
		this.id = id;
		this.name = name;
	}
	
	void Display() {
		
		System.out.println("========");
		System.out.println(id);
		System.out.println(name);

		
	}

}
