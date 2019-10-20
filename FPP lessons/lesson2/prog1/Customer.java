package lesson2.prog1;

public class Customer {
	private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address bilingAddress;
    private Address shipingAddress;
    
    public Customer(String name, String lastName, String ssn, Address billAddress, Address shipAddress){
    	this.firstName=name;
    	this.lastName=lastName;
    	this.socSecurityNum=ssn;
    	this.bilingAddress=billAddress;
    	this.shipingAddress=shipAddress;
    }
    public String toString(){
    	String s=String.format("%s %s %s %s %s", firstName, lastName,socSecurityNum,bilingAddress.toString(),shipingAddress.toString());
    	return s;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	public Address getBilingAddress() {
		return bilingAddress;
	}

	public void setBilingAddress(Address bilingAddress) {
		this.bilingAddress = bilingAddress;
	}

	public Address getShipingAddress() {
		return shipingAddress;
	}

	public void setShipingAddress(Address shipingAddress) {
		this.shipingAddress = shipingAddress;
	}
	
	
    

}
