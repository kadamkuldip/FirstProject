package demo18_Static_Block_2;

public class X {

	int a;

	X() {
		System.out.println("==Constructor of X==");
	}

	{
		a = 10;
		System.out.println("==Instance Block 1==");
		System.out.println("a = " + a);
	}
	
	{
		System.out.println("==Instance Block 2==");
	}

	static {
		System.out.println("==Static Block 1==");
	}
	static {
		System.out.println("==Static Block 2==");
	}

}
