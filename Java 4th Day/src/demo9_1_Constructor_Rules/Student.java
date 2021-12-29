package demo9_1_Constructor_Rules;

public class Student {

	int id;
	String name;
	String course;
	float gp;

	// Constructor:
	// Rule 1: Constructor name is EXACTLY same as class name
	// Rule 2: Constructor does not have return type
	// Objective: Used to initialize the data member or object
	// Executed during creation of the object. 
	// Executed ONLY once for 1 object.
	
	Student(int id, String name, String course, float gp) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.gp = gp;
	}

	/*
	 * // 2) Method: 
	 * void m1(int id, String name, String course, float gp){
	 *  this.id = id; 
	 *  this.name = name; 
	 *  this.course = course; 
	 *  this.gp = gp; 
	 *  }
	 */
}
