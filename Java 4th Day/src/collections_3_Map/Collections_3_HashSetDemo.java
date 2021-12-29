// 16-Oct-2021:

// HashSet:
/************************************************/
// Single NULL - Allowed
// Duplicate values not allowed
/************************************************/
package collections_3_Map;

import java.util.HashSet;

import collections_2_ArrayList_Sorting.Item;

public class Collections_3_HashSetDemo {
	public static void main(String[] args) {
		
		Item i1 = new Item(121, "Pen", 40); 		
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000); 	
		Item i4 = new Item(45, "Table", 240);

		HashSet<Item> itemlist = new HashSet<Item>();
		
		itemlist.add(i1);
		itemlist.add(i2);
		itemlist.add(i3);
		itemlist.add(i4);
		itemlist.add(null);
		itemlist.add(null);
		
		// HashSet does not maintain Insertion Order
		itemlist.forEach(hs->System.out.println(hs));
		
		// HashSet - Duplicate values not allowed
		itemlist.add(i1);
		itemlist.add(i1);
		itemlist.forEach(hs->System.out.println(hs));
		
	}
}
