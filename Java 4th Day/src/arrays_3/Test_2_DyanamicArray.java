package arrays_3;

import java.util.Scanner;

public class Test_2_DyanamicArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[3]; // fixed size array
		System.out.println("Enter array elements for arr1[]...");

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Elements of arr1 are...");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("==============================================");
		
		// We can also get input for array size from user:
		System.out.println("Enter the size of array arr2[] ...");
		int size = sc.nextInt();
		int arr2[] = new int[size];

		System.out.println("Enter array elements for arr2[]...");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println("Elements of arr2 are...");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
			

	}

}
