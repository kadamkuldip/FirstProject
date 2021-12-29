package demo12_Polymorphism_4_Overloading;

public class Test {
	
	public static void main(String[] args) {
	
		A obj = new A();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2, 3, 4));
	}
}
