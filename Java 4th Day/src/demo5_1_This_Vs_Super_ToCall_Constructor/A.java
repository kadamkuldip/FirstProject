package demo5_1_This_Vs_Super_ToCall_Constructor;

public class A {

	A() {
		super();
		System.out.println("Constructor");
	}

	A(int a) {
		this();
		System.out.println("Parameterize Constructor");
	}

	A(int a, int b) {
		this(a);
		System.out.println("Parameterize Constr with 2 Para");
	}

}
