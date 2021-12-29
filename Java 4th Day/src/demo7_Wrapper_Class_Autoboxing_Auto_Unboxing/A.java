package demo7_Wrapper_Class_Autoboxing_Auto_Unboxing;

public class A {
	
	void m1() {
		int a = 10;	
		a=a+1;
		System.out.println("Value of 'a' in m1 =" +a);
		
	}
	
	void m2() {
		Integer a = 10; // Integer is a Wrapper Class
		a=a+1;
		System.out.println("Value of 'a' in m2 = " +a);
		
		float b = a.floatValue();
		System.out.println("Value of 'B' = " +b);
	}

}
