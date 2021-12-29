// 09-Oct-2021:
// Use of Scanner class:
// 1) Used to get input values from user
// 2) We need to import the java.util.Scanner class

/**************************************************************/

package arrays_2_ScannerClass;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// int a=10; //Static declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value of a = ");
		int a = sc.nextInt();
		System.out.println("Enter int value of b = ");
		int b = sc.nextInt();
		int c = a+b;
		System.err.println("addition of a & b = " +c);
		System.out.println("==================================");
		
		System.out.println("Enter String Text = ");
		String s = sc.next();
		System.out.println("Entered text = "+s);

	}
}
