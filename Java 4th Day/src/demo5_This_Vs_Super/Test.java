// 28-Aug-2021:
/****************************************/
// 'this' Vs 'super' keywords: //
/****************************************/
// Accessing or calling Instance Variable using 'this' / 'super' keyword:

// 1) To get Instance variable value from Child class - use 'this' keyword
// 2) To get Instance variable value from Parent Class - use 'super' keyword
/*****************************************************************************/

package demo5_This_Vs_Super;

public class Test {
public static void main(String[] args) {
	
	Y obj1 = new Y(); 	// object initialization for Class Y
	obj1.m1();			// calling method
	
	System.out.println("---- When called from main() ---");
	System.out.println("class object ref, value of t = "+obj1.t);	
	
	X obj2 = new X();	// object initialization for Class X
	System.out.println("Parent class object ref, value of t = "+obj2.t);
	
	X obj3 = new Y();
	System.out.println("Hybrid = "+obj3.t);
}
}
