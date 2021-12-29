// 16-Oct-2021:
// LinkedHashMap <key, value>:
// Keys are always unique. It does not allowed duplicate values

package collections_3_Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import collections_2_ArrayList_Sorting.Item;

public class Collections_8_LinkedHashMapDemo {
	public static void main(String[] args) {

		Item i1 = new Item(123, "Pen", 40);
		Item i2 = new Item(24, "Ball", 100);
		Item i3 = new Item(35, "Mobile", 40000);
		Item i4 = new Item(45, "Table", 400);
		Item i5 = new Item(71, "Chair", 120);

		LinkedHashMap<Integer, Item> itemmap = new LinkedHashMap<Integer, Item>();

		itemmap.put(34, i1);
		itemmap.put(35, i2);
		itemmap.put(41, i3);
		itemmap.put(11, i4);
		itemmap.put(41, i5); // adding 2nd object(i5) on same key for object i3
		itemmap.put(null, i5); // null value for key?
		// itemmap.put(null, i5); // trying 2nd null value for key? - NOT allowed


		System.out.println("=== To get Key-Value pair in LinkedHashMap ===========");
		itemmap.forEach((key, val) -> System.out.println(key + " " + val));

		System.out.println(" ");
		System.out.println("=== .keySet()method to get set<> of only keys =========");
		Set<Integer> keys = itemmap.keySet();
		keys.forEach(key -> System.out.println(key));

		System.out.println(" ");
		System.out.println("=== To get collection<> of only values =========");
		Collection<Item> collection = itemmap.values();
		collection.forEach(i -> System.out.println(i));
		
		System.out.println(" ");
		System.out.println("=== To get entryset<> of Key-Value pair =========");
		
		Set<Entry<Integer, Item>> entryset = itemmap.entrySet();
		entryset.forEach(s->System.out.println(s.getKey()+ " "+ s.getValue()));
		
		
	}

}
