package demo19_1_Final_Variable;

public class A {
	
	int x = 10;
	static final int  y = 20;
	
	A(){
		x++;
		// y++; // y is final - so we cannot change it's value
	}

}
