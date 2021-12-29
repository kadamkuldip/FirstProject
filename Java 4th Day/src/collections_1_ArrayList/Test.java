// 09-Oct-2021:
// ArrayList<>:
// Use of 1) Iterator 2) ListIterator 
// 3) Enhanced for() & 4) Lamda expression on ArrayList<>
/************************************************************/


package collections_1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {

		Item i1 = new Item(12, "Pen", 40);
		Item i2 = new Item(24, "Pencil", 10);
		Item i3 = new Item(35, "Mobile", 40000);
		Item i4 = new Item(45, "Table", 240);

		ArrayList<Item> itemlist = new ArrayList<Item>();

		itemlist.add(i1);
		itemlist.add(i2);
		itemlist.add(i3);
		itemlist.add(i4);

		// calculate cost of total items;
		float total_cost = 0;

		//1. use Enhanced for()
		System.out.println("==============================================");
		System.out.println("=== 1. Using Enhanced for() ===");
		for (Item t : itemlist) { 
		  total_cost = total_cost + t.getCost();
		  System.out.println(t); 
		}
		System.out.println(total_cost);

		System.out.println("==============================================");
		System.out.println("=== 2. Using Lambda expression: ===");
		//2. Using Lambda expression:
		itemlist.forEach(t -> System.out.println(t));

		//3. Using Iterator:
		// This is generally used in old project. Recently everyone uses enhanced for() or Lambda expression

		System.out.println("==============================================");
		System.out.println("=== 3. Using Iterator: ===");

		Iterator<Item> listI = itemlist.iterator();
		while(listI.hasNext()) {
			System.out.println(listI.next());
		}
		
		// Disadvantage of Iterator:
		// Iterator moves only in forward direction.
		
		//4. List Iterator: moves in forward + backward direction:
		System.out.println("==============================================");
		System.out.println("=== 4.1 List Iterator ===");
		ListIterator<Item> listLi = itemlist.listIterator();
		while(listLi.hasNext()) {
			System.out.println(listLi.next());
		}
		System.out.println("==============================================");
		System.out.println("=== 4.2 Reverse direction ===");
		while(listLi.hasPrevious()) {
			System.out.println(listLi.previous());
		}
				
	}

}