//25-Sept-2021:
// Static Method():
/**************************************************/
//Static method() can use only static variable
// and can call Static method() only
/**************************************************/
// Instance method can access Instance variable, static variable 
// and can call Instance method() as well as static method()
/**************************************************/

package demo17_Static_Method_1;

public class Test {
	public static void main(String[] args) {

		// calling static variable & static method() using class name
		System.out.println(A.y);
		A.m1();

		A obj = new A();
		obj.m2();

	}

}
