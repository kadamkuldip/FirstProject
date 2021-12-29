// 28-Aug-2021:
// Local variable Vs Instance Variable:
// ---------------------------------------

package demo2_Local_Vs_InstanceVariable;

public class Test {
	public static void main(String[] args) {

		Student s1 = new Student(); // Create new object

		s1.id = 123;
		s1.name = "Kuldeep";
		s1.gender = 'M';

		// Create local variable but do not assigned value to it.
		int eid; // local variable
		String eName; // local variable
		char eGender; // local variable

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.gender);

		System.out.println(eid); // local variable does not get default value set
		System.out.println(eName);
		System.out.println(eGender);

	}

}
