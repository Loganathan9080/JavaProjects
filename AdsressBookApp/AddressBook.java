package AdsressBookApp;

import java.util.ArrayList;

public class AddressBook {

	ArrayList<Address> address;

	public AddressBook() {
		address = new ArrayList<Address>();
	}

	// Add method
	public void addAddress(Address add) {
		address.add(add);
	}

	// remove method
	public boolean removeAddress(String name) {
		Address Remove = null;
		for (Address Add : address) {
			if (Add.getName().equalsIgnoreCase(name)) {
				Remove = Add;
				break;
			}
			
		}
		if (Remove != null) {
			address.remove(Remove);
			return true;
		}
		return false;
	}

	// search method
	public Address searchByname(String name) {
		for (Address add : address) {
			if (add.getName().equalsIgnoreCase(name)) {
				return add;
			}
		}
		return null;

	}

	// display all contacts method
	public void getAddress() {
		for (Address add : address) {
			System.out.println(
					add.getName() + " -- " + add.getNumber() + " -- " + add.getEmail() + " -- " + add.getCity());
		}
	}
}
