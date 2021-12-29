// 10-Oct-2021:
// ArrayList<>
// 1. Sorting using 'Comparable' Interface
// 2. Sorting using 'Comparator' Interface
/************************************************/

package collections_2_ArrayList_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {

		Item i1 = new Item(12, "Pen", 40);
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000);
		Item i4 = new Item(45, "Table", 240);

		List itemlist = new ArrayList<Item>();

		itemlist.add(i1);
		itemlist.add(i2);
		itemlist.add(i3);
		itemlist.add(i4);

		// 1. Sorting on the basis of Comparable
		System.out.println("=== 1. Sorting using Comparable interface & it's compareTo() method ===");
		System.out.println("=======================================================================================");
		Collections.sort(itemlist); itemlist.forEach(i->System.out.println(i));
		System.out.println("====================================================");
		System.out.println("");

		
		// 2) Sorting on the basis of name using Comparator:		
		ItemNameComparator c = new ItemNameComparator();
		Collections.sort(itemlist, c);
		
		System.out.println("=== 2. Sorting using Comparator interface & it's customised compare() method ===");
		System.out.println("=======================================================================================");

		System.out.println("=== 2.1 Sorting using compare() method on 'Name' ===");
		itemlist.forEach(i->System.out.println(i));
		System.out.println("====================================================");
		
		// 3) Sorting on the basis of cost using Comparator:
		ItemCostComparator costcom = new ItemCostComparator();
		Collections.sort(itemlist, costcom);
		
		System.out.println("=== 2.2 Sorting using compare() method on 'Cost' ===");
		itemlist.forEach(i->System.out.println(i));
		
		
	}

}
