package constructorsDemo1;

public class Student {

	int id; // Instance Variables
	String name; // Instance Variables

	// This is default constructor.
	// If this is not defined - compiler will add it during run time.

	Student() {
		System.out.println("--Default Constructor--");
	}

	void m1() {
		System.out.println("--inside m1() --");
	}

	void m2() {
		System.out.println("--inside m2() --");
	}

}
