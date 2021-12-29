package collections_2_ArrayList_Sorting;

import java.util.Comparator;

public class ItemCostComparator implements Comparator<Item> {

	@Override
	public int compare(Item i1, Item i2) {
		Float cost1 = i1.getCost();
		Float cost2 = i2.getCost();
		
		return cost1.compareTo(cost2);
	}
	
}
