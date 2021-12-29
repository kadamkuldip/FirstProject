// 16-Oct-2021:
// LinkedList - Different ways to iterator collections:

package collections_3_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import collections_2_ArrayList_Sorting.Item;

public class Collections_2_LinkedListDemo {
	public static void main(String[] args) {
		
		System.out.println("This program is for 'LinkedList - Iteration Ex.'");
		System.out.println("=========================================================");
		Item i1 = new Item(121, "Pen", 40); 		
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000); 	
		Item i4 = new Item(45, "Table", 240);
		
		LinkedList<Item> itemlist = new LinkedList<Item>();

		itemlist.add(i1); 
		itemlist.add(i2); 
		itemlist.add(i3); 
		itemlist.add(i4);
		
		System.out.println("1. Using simple for() loop ========= ");
		for (int i=0; i<itemlist.size();i++) {
			System.out.println(itemlist.get(i));
		}
		
		System.out.println("2. Using Enhanced for(:) loop ========= ");
		for(Item t:itemlist) {
			System.out.println(t);
		}
		
		System.out.println("3. Using Iterator()========= ");
		Iterator itr = itemlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("4. Using ListIterator()========= ");
		ListIterator listitr = itemlist.listIterator();
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}

		System.out.println("5. foreach========= ");
		itemlist.forEach(s->System.out.println(s));
		
		System.out.println("=== To check if Insertion Order is maintained in LinkedList or not? === ");
		itemlist.forEach(s->System.out.println(s));
		
		System.out.println("=== To check if NULL value is allowed in LinkedList or not? === ");
		System.out.println("=== Try to add single Null items in LinkedList ===");
		
		itemlist.add(null);
		itemlist.forEach(s->System.out.println(s));
		
		System.out.println("=== Try to add multiple Null items in item LinkedList ===");
		
		itemlist.add(null);
		itemlist.add(null);
		itemlist.forEach(s->System.out.println(s));
		
		System.out.println("To check if duplicate elements is allowed in LinkedList or not?");
		itemlist.add(i1);
		itemlist.add(i1);
		itemlist.forEach(s->System.out.println(s));
		
		
	}

}
