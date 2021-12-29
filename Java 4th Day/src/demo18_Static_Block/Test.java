//25-Sept-2021:
// Static block:
/****************************************************************************/
// Static block is run only once during the loading of class in memory.
// While creating object only Instance block & Constructor will be executed.
// Note 1: First Instance block is executed before Cosntructor
// Note 2: We can have multiple Instance blocks or multiple Static blocks
/****************************************************************************/

package demo18_Static_Block;

public class Test {
	public static void main(String[] args) {

		X obj1 = new X();

	}
}
