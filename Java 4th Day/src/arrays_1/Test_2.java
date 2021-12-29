// Arrays:
// Practice from jbktutorials.com
/************************************/

package arrays_1;

public class Test_2 {

	public static void main(String[] args) {

		int a[][] = new int[3][4];

		// (Number of arrays required) Three arrays required
		int x[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 }, { 1, 2 } };
		
		System.out.println("x[1][1] = " + x[0][0]);
		System.out.println("x[1][2] = " + x[1][0]);
		System.out.println("x[2][3] = " + x[2][3]);
		System.out.println("========================");

		int s[][] = new int[4][]; // OK
		// int xx[][]=new int[][]; //error size in first bracket is must

		// add values in row = 0
		s[0] = new int[3];
		s[0][0] = 1;
		s[0][1] = 2;
		s[0][2] = 3;

		// add values in row = 1
		s[1] = new int[3];
		s[1][0] = 1;
		s[1][1] = 2;
		s[1][2] = 3;
		// add values in row = 2
		s[2] = new int[3];
		s[2][0] = 1;
		s[2][1] = 2;
		s[2][2] = 3;
		// add values in row = 3
		s[3] = new int[3];
		s[3][0] = 1;
		s[3][1] = 2;
		s[3][2] = 3;
		/*
		 * s[4] = new int[3]; //will not correct at runtime s[4][0] = 1; s[4][1] = 2;
		 * s[4][2] = 3;
		 */

		System.out.println("s[1][1] = " + s[1][1]);
	}
}