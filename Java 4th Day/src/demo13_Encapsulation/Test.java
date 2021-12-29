// 18-Sept-2021:
// Encapsulation: Setter() & Getter() methods
/*******************************************************************************************/
// Industry Standard: 
// 1. Define variables as 'private' --> So they are not visible to others
// 2. whatever logic needs to be required, implement it in Setter() & Getter() methods.
// 3. Make these setter() & getter() methods as 'public'
/*******************************************************************************************/


package demo13_Encapsulation;

public class Test {

	public static void main(String[] args) {

		Account a1 = new Account(101, "Kuldeep", 5000);
		
		a1.setBalance(-1500);
		System.out.println(a1.getBalance());
		
		
	}

}
