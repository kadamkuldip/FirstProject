// Arrays:
// Practice from jbktutorials.com
/************************************/

package arrays_1;

import java.util.Arrays;

public class Test_ArraySorting {

	public static void main(String[] args) {
		
		int a[] = { 4, 7, 2, 1, 3, 8, 6, 10, 9 };
		System.out.println("==Before sorting==");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+ "]= " + a[i]);
		}
		
		Arrays.sort(a); // merge sorting
		System.out.println("==After sorting==");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+ "]= " + a[i]);// 1 2 -----10
		}

		System.out.println("============================");
		System.out.println(Arrays.binarySearch(a, 7));
		System.out.println(Arrays.binarySearch(a, 12));

		System.out.println("============================");
		int x[][] = { { 3, 1, 2 }, { 5, 6, 7 }, { 9, 8, 7, 9 }, { 2, 4, 3 } };
		System.out.println("Before sorting");
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				System.out.println("x[" +i+ "][" +j+ "]= " + x[i][j]);
			}
		}
		System.out.println("==================");
		
		// Use Sort() method
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
		}
		System.out.println("After sorting:");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println("x[" +i+ "][" +j+ "]= " + x[i][j]);
			}
			System.out.println("------------");

		}
		System.out.println(" ");

		System.out.println("Ex. of .fill() method:");
		int s5[] = new int[6];
		s5[0] = 10;
		s5[4] = 44;
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}

		Arrays.fill(s5, 99);
		System.out.println("Array after using .fill() method:");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i] + " ");
		}
	}
}