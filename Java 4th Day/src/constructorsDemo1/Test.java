// 04-Sept-2021:
// Constructors:
// For 1 object, constructor is run only once that to only at time of creation of object

package constructorsDemo1;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.m1();
		s1.m2();
		
		System.out.println(s1.id); 	// Default value of Instance variable
		System.out.println(s1.name);
	}
}
