// 04-Sept-2021:
// Constructor & Inheritance:
// Parameterized Super()


package constructorsDemo2;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student (1, "Kuldeep", "10-Jan", "Pune", 123, "BE");
		Student s2 = new Student (2, "Swati", "12-Jan", "Satara", 124, "BE");
		
		System.out.println("==========");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.dob);
		System.out.println(s1.address);
		
		System.out.println(s1.rollno);
		System.out.println(s1.course);
		
		System.out.println("==========");
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.dob);
		System.out.println(s2.address);
		
		System.out.println(s2.rollno);
		System.out.println(s2.course);

		
	}
}
