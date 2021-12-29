package demo16_Static_Variable_2;

public class Test {
	public static void main(String[] args) {
		
		A obj1 = new A();
		System.out.println("====obj1===");

		System.out.println("x = " +obj1.x);
		System.out.println("y = " +obj1.y);
		
		A obj2 = new A();
		System.out.println("====obj2===");
		System.out.println("x = " +obj2.x);
		System.out.println("y = " +obj2.y);
		
		A obj3 = new A();
		System.out.println("====obj3===");
		System.out.println("x = " +obj3.x);
		System.out.println("y = "+ obj3.y);
		
	}
	
	

}
