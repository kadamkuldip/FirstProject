// 04-Sept-2021:
// Parameterize constructors:

package constructorsDemo1Dot1;

public class Test {


	public static void main(String[] args) {
		
		Student s1 = new Student(11, "KK");
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		//If Parameterize constructor is defined in class, JAVA will not add default constructor.
		// so we can not use below line for object creation. JAVA will throw compilation error.
		// we need to pass the parameters while creating objects.
		
		// Student s2 = new Student();
		
		
		
	}

}
