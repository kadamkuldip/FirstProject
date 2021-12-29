//17-Oct-2021:
// FunctionalInterface:
// FunctionalInterface can have max 1 abstract method.
// we cannot add non-abstract method()
// We can also add default method()

// Java is famous for object oriented programming language....it is very stable, robust programming language.
// But functional based programming languages do have their own features...
// How java can support such feature?
// --> with the help of Functional Interface - we are achieving functional programming in Java

/******************************************************/

package collections_4;

@FunctionalInterface
public interface A {
	
	void m1(int x, int y);
	
	static void m2() {}
	static void m3() {}
	default void m4() {}

}
