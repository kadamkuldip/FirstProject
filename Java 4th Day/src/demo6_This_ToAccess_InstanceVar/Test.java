// 29-Aug-2021:
// How to access Instance variables using 'this' keyword

package demo6_This_ToAccess_InstanceVar;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();			// New Object created
		s1.m1(101, "Kuldeep", "BE", 90.1f);	// Passing values to object

		Student s2 = new Student();
		s2.m1 (201, "Samidha", "ME", 95.2f);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.course);
		System.out.println(s1.percentage);
		System.out.println("--------");
		System.out.println(s2.id);
		
	}
}
