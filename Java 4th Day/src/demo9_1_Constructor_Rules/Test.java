// 29 Aug 2021:
// Constructor:
// 1) To initialize the data member of class
// 2) To initialize object
// 3) Constructor does NOT have a return type 

package demo9_1_Constructor_Rules;

public class Test {
	public static void main(String[] args) {

		/*
		 * Student s1 = new Student(); 
		 * s1.id = 10; // passing values to each parameter of object s1 
		 * s1.name = "KK1"; 
		 * s1.course = "BE"; 
		 * s1.gp = 5.0f;
		 * 
		 * System.out.println(s1.id); 
		 * System.out.println(s1.name);
		 * System.out.println(s1.course); 
		 * System.out.println(s1.gp);
		 * 		 * 
		 * 
		 * // 2) New way of writing code 
		 * Student s2 = new Student();
		 * 
		 * s2.m1(11, "KK2", "BE", 6.0f);
		 * 
		 * System.out.println(s2.id); 
		 * System.out.println(s2.name);
		 * System.out.println(s2.course); 
		 * System.out.println(s2.gp);
		 */

		// 3) using Constructor:

		Student s3 = new Student(12, "KK3", "BE", 7.1f);

		System.out.println("---Using constructor---");
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.course);
		System.out.println(s3.gp);

	}
}
