// 16-Oct-2021:
// TreeSet:
// Used when sorted data is required
// But we cannot add NULL values in TreeSet

package collections_3_Map;

import java.util.TreeSet;

import collections_2_ArrayList_Sorting.Item;

public class Collections_5_TreeSetDemo {
	public static void main(String[] args) {

		Item i1 = new Item(123, "Pen", 40);
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000);
		Item i4 = new Item(45, "Table", 240);

		TreeSet<Item> itemlist = new TreeSet<Item>();

		itemlist.add(i1);
		itemlist.add(i2);
		itemlist.add(i3);
		itemlist.add(i4);

		System.out.println("====================================");

		itemlist.forEach(s -> System.out.println(s));

	}

}
