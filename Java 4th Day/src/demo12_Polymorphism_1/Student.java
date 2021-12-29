// 18-Sept-2021:
// Constructor Overloading
/***************************/

package demo12_Polymorphism_1;

public class Student {

	int id;
	String name;
	
	// Constructor Overloading
	Student() {

	}

	Student(int id) {
		this.id = id;
	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	Student(String name, int id){
		this.id=id;
		this.name=name;
	}

}
