// 16-Oct-2021:
// Linked HashSet:

package collections_3_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import collections_2_ArrayList_Sorting.Item;

public class Collections_4_Linked_HashSetDemo {
	
	public static void main(String[] args) {
		Item i1 = new Item(12, "Pen", 40); 		
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000); 	
		Item i4 = new Item(45, "Table", 240);

		LinkedHashSet<Item> itemlist = new LinkedHashSet<Item>();
		
		itemlist.add(i1); 
		itemlist.add(i2); 
		itemlist.add(i3); 
		itemlist.add(i4);
		
		// Iterator
		Iterator itr = itemlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("====================================");
		
		//Duplicate elements are NOT allowed
		itemlist.add(i1); 
		itemlist.add(i1); 
		
		itemlist.add(null); // single NULL value is allowed
		itemlist.add(null); // multiple NULL values are not allowed

		//forEach() method
		itemlist.forEach(s->System.out.println(s));
	
	
	}
	

}
