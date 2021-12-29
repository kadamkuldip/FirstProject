package demo6_This_ToAccess_InstanceVar;

public class Student{
	int id; 		// Defining Global variable
	String name; 	// Defining Global variable
	String course; 	// Defining Global variable
	float percentage; 	// Defining Global variable

	void m1 (int id, String name, String course, float percentage){
	this.id = id; // assigning Local variable value to Global variable
	this.name = name;
	this.course = course;
	this.percentage = percentage;

	}
}