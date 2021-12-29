package demo5_1_This_Vs_Super_ToCall_Method;

public class B extends A {

	void m1() {
		System.out.println("Child class m1()");
		System.out.println("====================");
	}
	void m2() {
		m1();
		// Calling Instance method from Child class
		this.m1(); 
		// Calling Instance method from Parent class
		super.m1();

	}

}
