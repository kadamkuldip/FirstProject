// 05-Sept-2021:
/*********************************************/
// This_Vs_Super Keywords: To Call Methods
/*********************************************/

package demo5_1_This_Vs_Super_ToCall_Method;

public class Test {

	public static void main(String[] args) {

		// 1. Reference of Child Class + Object of Child class
		B obj = new B();
		obj.m1();
		// 2. Reference of Parent Class + Object of Child class
		A obj1 = new B();
		obj1.m1();
		
		// In above cases - only child class m1() is getting called 
		// but we are not able to call Base Class m1() method :(
		
		B obj2 = new B();
		obj2.m2();

	}

}
