package demo5_This_Vs_Super;

public class Y extends X {
	// Y is Child of X class

	int t = 200; 		// Instance Variable from Child class
		
	void m1(){
		int t = 300; 	// Local variable
		
		System.out.println("Value of t = "+t);

		System.out.println(">> Use 'this' to get Instance variable value from Child class - use 'this' keyword");
		System.out.println("Value of t = "+this.t);
		System.out.println(">> Use 'super' to get Instance variable value from Parent Class - use 'super' keyword");
		System.out.println("Value of t = "+super.t);
		
	}
	
}
