package demo12_Polymorphism_2;

class Object {
	public String toString() {
		return "Hello!";
	}
}

// Note: All the callses in JAVA by default extend to Object() class.
public class Student extends Object {

	@Override
	public String toString() {
		return "Bye Bye";

	}
}
