// 26-Sept-2021:
// String
/*********************/

package demo20_String_1;

public class Test {
	public static void main(String[] args) {

		String s1 = new String("Kuldeep");
		String s2 = new String("Kuldeep");
		if (s1 == s2)
			System.out.println("s1 & s2 are same");
		else
			System.out.println("s1 & s2 are NOT same");

		String s3 = "Kadam";
		String s4 = "Kadam";
		if (s3 == s4)
			System.out.println("s3 & s4 are same");
		else
			System.out.println("s3 & s4 are NOT same");

	}

}
