//09-Oct-2021:
// Find Odd Numbers in Array

package arrays_3;

public class Test_4_FindOddNumbersinArray {
	public static void main(String[] args) {
		
		int a[] = {10, 20, 31, 41};
		
		for(int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("a["+i+"] is even number");
			}
			else
				System.out.println("a["+i+"] is odd number");

		}
		
		
	}

}
