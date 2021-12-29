// 09-Oct-2021:
// Sum Of Array Elements:

package arrays_3;

public class Test_3_SumOfArrayElements {
	
	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 40};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];			
		}
		System.out.println("Summ of array elemetns = " + sum);
		
	}

}
