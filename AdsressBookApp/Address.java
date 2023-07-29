package AdsressBookApp;

public class Address {

	String name;
	String number;
	String email;
	String city;

	public Address(String name, String number, String email, String city) {

		this.name = name;
		this.number = number;
		this.email = email;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", number=" + number + ", email=" + email + ", city=" + city + "]";
	}

}
