package demo4_ThisKeyword;

public class Student {
	
	long id;
	String name;
	
	void m1() {
		this.id = 139;			//Value assigned to Global variable
		this.name = "Kuldeep";
		
		long id = 101;			//value gets assigned only inside method
		String name = "Kadam";
			
	}
		
	void m2() {
		System.out.println("===Inside m2()===");
		System.out.println(this.id);
		System.out.println(this.name);

	}

}
