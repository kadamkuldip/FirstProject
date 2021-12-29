package collections_3_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import collections_2_ArrayList_Sorting.Item;

public class Collections_7_HashMapDemo {
	public static void main(String[] args) {
		Item i1 = new Item(123, "Pen", 40);
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000);
		Item i4 = new Item(45, "Table", 240);

		HashMap<Integer, Item> itemmap = new HashMap<Integer, Item>();

		itemmap.put(34, i1);
		itemmap.put(35, i2);
		itemmap.put(41, i3);
		itemmap.put(11, i4);
		
		System.out.println("=== Iterate the HashMap using forEach() method ===========");
		itemmap.forEach((key, val) -> System.out.println(key + " " + val));

		System.out.println(" ");
		System.out.println("=== .keySet()method to get set of all keys =========");
		Set<Integer> keys = itemmap.keySet();
		keys.forEach(key -> System.out.println(key));

		System.out.println(" ");
		System.out.println("=== To print collection of all values =========");
		Collection<Item> collection = itemmap.values();
		collection.forEach(i -> System.out.println(i));

	}

}
