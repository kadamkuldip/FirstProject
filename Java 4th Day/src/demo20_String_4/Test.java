package demo20_String_4;

public class Test {
	public static void main(String[] args) {
		
		String s = "Hello";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("Hello");
		s1.append(" How are you");
		System.out.println(s1);
		
	}

}
