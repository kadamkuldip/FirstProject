//17-Oct-2021:
// Java 1.8:
// from Java 1.8 - we can have static method inside interface
// Also we can have abstract method()
// we cannot add non-abstract method()

// But we can add default method() - Why?
// Reason: Default method is instance method & technically this should not be allowed in interface
// but if you are already in production, there is an interface (say xyz) which has so many things inside it...
// & you have implemented it...i.e. some other classes are using/ implementing this interface xyz,
// now if we need to add new method() - there was no space...

// So from Java 1.8 onwards - such methods can be written in Interface as a default method

package collections_4;

public interface B {

	void m3();

	default void m4() {

	}

	// Java 10 or 11 onwards we can add private method
	private void aaa() {
		
	}
	
	static void m1() {
		System.out.println("=== m1() ===");
	}

	static void m2() {
		System.out.println("=== m2() ===");
	}

}
