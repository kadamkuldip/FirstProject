package demo18_Static_Block;

public class X {

	X() {
		System.out.println("==Constructor of X==");
	}

	{
		System.out.println("==Instance Block==");
	}

	static {
		System.out.println("==Static Block==");
	}
}
