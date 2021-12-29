package collections_2_ArrayList_Sorting;

public class Item implements Comparable<Item>{
	private int id;
	private String name;
	private float cost;

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Item(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	// Implementation of compareTo() method of Interface 'Comparable':
	@Override
	public int compareTo(Item o) {
		Integer id1 = this.id;
		Integer id2 = o.id;
		return id1.compareTo(id2);
	}
}
