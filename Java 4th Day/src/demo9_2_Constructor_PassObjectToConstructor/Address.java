package demo9_2_Constructor_PassObjectToConstructor;

public class Address {
	int toFlatno;
	String toName;
	String flatNo;
	String addrLine1;
	String addrLine2;
	int pin;
	
	public Address(int id, String toName, String addrLine1, String addrLine2, int pin) {
		super();
		this.toFlatno = id;
		this.toName = toName;
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.pin = pin;
	}

	
	
}
