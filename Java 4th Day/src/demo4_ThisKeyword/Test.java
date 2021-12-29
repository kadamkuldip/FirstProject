// 28-Aug-2021:
// Use of 'this' keyword:
// Assign values to Instance variable using 'this' keyword

package demo4_ThisKeyword;

public class Test {
	
	public static void main(String[] args) {
		
		Student s1 = new Student ();
		
		s1.m1();
		s1.m2();
		
		System.out.println("==== Inside main() ====");
		System.out.println(s1.id); // Calling Instance Variable
		System.out.println(s1.name);
		
	}

}
