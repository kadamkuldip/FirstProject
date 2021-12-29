package constructorsDemo1Dot1;

public class Student {

	int id; 		// Instance Variables
	String name; 	

	// Parameterize Constructor
	Student(int id, String name) {
		
		System.out.println("--Parameterize Constructor");
		this.id = id; // Assigning values to global or Instance variable
		this.name = name;
	
	}


}
