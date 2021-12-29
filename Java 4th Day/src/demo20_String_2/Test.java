// 26-Sept-2021:
// String:
/************************************************/
// Use equals method to compare the strings
// String is immutable
/************************************************/

package demo20_String_2;

public class Test {

	public static void main(String[] args) {

		String s1 = new String("Kuldeep");
		String s2 = new String("Kuldeep");
		
		// Use equals method to compare the strings
		if (s1.equals(s2))
			System.out.println("Hello of s1 & s2 are same");
		else
			System.out.println("Hello of s1 & s2 are NOT same");

	}

}
