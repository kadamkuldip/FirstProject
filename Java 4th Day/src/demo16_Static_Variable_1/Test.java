//25-Sept-2021:
// Static variable:
/*********************************************************************/
// Advantage: We don't need to create object to use Static Variable.
/*********************************************************************/

package demo16_Static_Variable_1;

public class Test {

	public static void main(String[] args) {
		
		// No need to create object to use Static variable
		System.out.println(SavingAccount.MIN_SAVING_BAL);
		System.out.println("============================");
		
		// Also static variable can be accessed using object of class
		SavingAccount acc1 = new SavingAccount();
		System.out.println(acc1.MIN_SAVING_BAL);
		
		
	}

}
