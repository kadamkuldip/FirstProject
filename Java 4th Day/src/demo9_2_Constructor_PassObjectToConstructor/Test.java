// 29-Aug-2021:
// Can we pass object to Constructor as a parameter? --> YES

package demo9_2_Constructor_PassObjectToConstructor;

public class Test {

	public static void main(String[] args) {

		Address addr = new Address(101, "SS", "Near Katraj", "Pune", 41523);

		Student s1 = new Student(12, "KK1", "BE", addr); //object addr is passed to Constructor as a parameter

		System.out.println(s1.sid);
		System.out.println(s1.name);
		System.out.println(s1.course);

		System.out.println("---To: ");
		System.out.println(s1.address.toName);
		System.out.println(s1.address.toFlatno);
		System.out.println(s1.address.addrLine1);
		System.out.println(s1.address.addrLine2);
		System.out.println(s1.address.pin);

	}

}
