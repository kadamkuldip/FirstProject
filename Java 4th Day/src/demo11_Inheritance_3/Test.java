// 11-Sept-2021: Inheritance:
/**********************************************************/
// (Child + Child) --> Child class Ref + Obj of child
// (Parent + Child) --> Parent class Ref + Obj of child
/**********************************************************/

package demo11_Inheritance_3;

public class Test {
	public static void main(String[] args) {

		B b1 = new B(); // (Child + Child) --> Child class Ref + Obj of child
		A a1 = new B(); // (Parent + Child) --> Parent class Ref + Obj of child

		b1.m1();
		a1.m1();

		System.out.println(b1.t1);
		System.out.println(a1.t1);

	}

}
