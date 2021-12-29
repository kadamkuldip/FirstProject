//25-Sept-2021:

package demo17_Static_Method_main;

public class Test {
	public static void main(String[] args) {
		
		// 1) Why main() method is defined as Public static?
		// Who calls main() method? - Main() is called by JVM
		// JVM will search for main method in every package. To be visible outside package, this main () method is defined as public.
		// JVM need to access main() method without creating any object…so main method is defined as Static.

		// 2) Why void?
		// JVM is not going to return anything to main method so main() method is defined as void

		// 3) Why (String[] args) is added in main() method?
		// To pass any parameters using command line 

		
	}

}
