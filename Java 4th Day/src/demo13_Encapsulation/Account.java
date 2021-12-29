package demo13_Encapsulation;

public class Account {

	private long id;
	private String name;
	private double balance;

	public Account(long id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void setBalance(double balance) {
		if (balance > 0)
			this.balance = this.balance + balance;
	}

	public double getBalance() {
		return balance;
	}

	// @return the id
	public long getId() {
		return id;
	}

	// @param id the id to set
	public void setId(long id) {
		this.id = id;
	}

	// @return the name
	public String getName() {
		return name;
	}

	// @param name the name to set
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @Override public String toString() { return
	 * this.id+" "+this.name+" "+this.balance; }
	 */

}
