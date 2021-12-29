//11-Sept-2021:
// Inheritance:
/*****************************************************/
// When Instance methods() are duplicate
// And (Ref of Parent Class) + (Obj of Child class)
// Then --> Preference is given to Parent Class
/*****************************************************/


package demo11_Inheritance_1;

public class Test {
	public static void main(String[] args) {

		B obj = new B();
		
		obj.m1();
		
	}
}
