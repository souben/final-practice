package prob1;

public class Customer {
	
	private String name;
	private String street;
	private String city;
	private String zipCode;
	
	public Customer(String name, String street, String city, String zipCode) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String toString(){
		return 	"[ Customer: " + name + " " + street + " " + city + " " + zipCode + "]"; 
	}
}
