package demo17_Static_Method_1;

public class A {

	int x = 10;
	static int y = 20;

	A() {
		x++;
		y++;
	}

	// Static method(): It can only access static variable
	static void m1() {
		// System.out.println(x); //Static method() can only access static variable
		System.out.println("==Inside Static method==");
		System.out.println(y);
	}

	// Instance method(): It can use instance variable as well as static variable
	void m2() {
		System.out.println("==Inside Instance method==");
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

	// Instance method():
	void m3() {

		m1(); // can call Static method()
		m2(); // can call Instance method()

	}
	
	// Static method()
	static void m4() {
		m1(); // can call static method()
		// m2(); // cannot call Instance method
	}

	
}
