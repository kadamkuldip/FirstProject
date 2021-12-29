// 16-Oct-2021:
// Stack: LIFO - Last In First Out:

package collections_3_Map;

import java.util.Stack;

import collections_2_ArrayList_Sorting.Item;

public class Collections_6_StackDemo {
	public static void main(String[] args) {

		Item i1 = new Item(123, "Pen", 40);
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000);
		Item i4 = new Item(45, "Table", 240);

		Stack<Item> itemlist = new Stack<Item>();

		itemlist.push(i1);
		itemlist.push(i2);
		itemlist.push(i3);
		itemlist.push(i4);
		System.out.println("=== After pushing elements in Stack ===");
		
		itemlist.forEach(s->System.out.println(s));
		
		System.out.println("");
		System.out.println("=== Stack: LIFO = Last In First Out ===");
		System.out.println("=== After pop() method ============================");

		System.out.println(itemlist.pop());
		System.out.println(itemlist.pop());
		System.out.println(itemlist.pop());
		System.out.println(itemlist.pop());

	}
}
