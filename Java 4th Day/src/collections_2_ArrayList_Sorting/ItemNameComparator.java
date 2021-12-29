package collections_2_ArrayList_Sorting;

import java.util.Comparator;

public class ItemNameComparator implements Comparator <Item>{

	@Override
	public int compare(Item i1, Item i2) {
		
		String name1 = i1.getName();
		String name2 = i2.getName();
				
		return 	name1.compareTo(name2);
	}

}
