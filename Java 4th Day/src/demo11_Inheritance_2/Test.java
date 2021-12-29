//11-Sept-2021:
// Inheritance:
/*****************************************************/
// When Instance variables are duplicate
// And (Ref of Parent Class) + (Obj of Child class)
// Then --> Preference is given to Parent Class
/*****************************************************/

package demo11_Inheritance_2;

public class Test {

	public static void main(String[] args) {

		// (Ref of Parent Class) + (Obj of Child class)
		A obj = new B();
		
		System.out.println("When (Ref of Parent Class) + (Obj of Child class)");
		System.out.println("t1 = " + obj.t1);
		
		// (Ref of Child Class) + (Obj of Child class)
		B obj2 = new B();
		
		System.out.println("When (Ref of Child Class) + (Obj of Child class)");
		System.out.println("t1 = " + obj2.t1);

	}

}
