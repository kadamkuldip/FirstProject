package while_1;

public class Test {

	public static void main(String[] args) {

		// sum of digits
		// count of digits
		// reverse + palindrome:
		
		int n = 1234;
		int rem;
		int SumOfDigits = 0;
		int count = 0;
		int revn = 0;
		int temp = n;
		
		while (n > 0) {
			rem = n % 10; 	// rem=1, rem=0, rem=7
			n = n / 10; 	// n=70, n=7

			SumOfDigits = SumOfDigits + rem;// sum=1, sum=1+0, sum=1+0+7
			count++; 		// count=1, 2, 3
			revn = (revn * 10) + rem;
		}
		
				
		System.out.println("Actual number =  " +n);
		System.out.println("SumOfDigits = " + SumOfDigits);
		System.out.println("digits count = " + count);
		System.out.println("reverse no = " +revn);

		if(temp==revn) 
			System.out.println("The number i Palindrome no.");
		else
			System.out.println("number is NOT Palindrome no.");
	}

}
