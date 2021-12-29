package demo3_Local_Vs_InstanceVariable;

public class X {
	// Instance variable
	int t = 10;

	void m1() {
		
		// Local Variable
		int t = 100;
		System.out.println("In Method m1(), t = " + t);
		
		// Here as the m1() has local variable t, 
		// during execution - value of local variable will be checked first 
		// hence we are not able to use the value of Global variable (i.e. t=10)
	
		//To access Instance variable inside method, we need to use 'this' keyword.
		System.out.println("In Method m1(), Instance variable t = " +this.t);
	
	}

	void m2() {
		System.out.println("In Method m2(), t = " + t);
		// --> Here since there is not local variable 't' inside m2() method,
		// it will try to find the global variable.
		// So t=10 will be displayed
	}

}
