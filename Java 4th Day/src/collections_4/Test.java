package collections_4;

public class Test {
	public static void main(String[] args) {
		
		X objx = new X();
		objx.m1(10, 11);
		
		Y objy = new Y();
		objy.m1(10, 12);
		
		A obja;
		obja = (x,y) -> System.out.println(x+y);
		obja.m1(10, 20);
		
		obja = (x,y) -> System.out.println(x*y);
		obja.m1(10, 21);
		
	}

}
