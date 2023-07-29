package AdsressBookApp;

import java.util.Scanner;

public class AddressBookApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddressBook address = new AddressBook();
		boolean running = true;
		System.out.println("Welcome to Address Book Application");
		while (running) {
			menu();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			// Add case
			case 1:
				System.out.println("Enter your name:");
				String name = scanner.nextLine();
				System.out.println("Enter your phoneNumber: ");
				String number = scanner.nextLine();
				System.out.println("Enter your email:");
				String email = scanner.nextLine();
				System.out.println("Enter your city:");
				String city = scanner.nextLine();
				Address add = new Address(name, number, email, city);
				address.addAddress(add);
				System.out.println("Added Successfully.");
				break;
			// remove case
			case 2:
				System.out.println("Enter the name to remove the contact: ");
				String name1 = scanner.nextLine();
				boolean removed = address.removeAddress(name1);
				if (removed) {
					System.out.println("Contact removed Successfully");

				} else {
					System.out.println("Contact not found!");
				}

				break;

			case 3:// search case
				System.out.println("Enter the name to search: ");
				String searchName = scanner.nextLine();
				Address foundContact = address.searchByname(searchName);
				if (foundContact != null) {
					System.out.println("Contact Found: " + foundContact.getName() + " -- " + foundContact.getNumber()
							+ " -- " + foundContact.getEmail() + " -- " + foundContact.getCity());
				} else {
					System.out.println("Contact not found!");
				}
				break;
			case 4:// display all
				System.out.println("All contacts: ");
				address.getAddress();
				break;
			case 5:// exit
				System.out.println("Thank you!");
				System.exit(0);

			default:
				System.out.println("Invalid choice! Try again...");
				break;
			}
		}
	}
//menu list
	private static void menu() {
		System.out.println("Menu: ");
		System.out.println("1.Add Contact: ");
		System.out.println("2.Remove Contact: ");
		System.out.println("3.Search Contact: ");
		System.out.println("4.Display Contacts: ");
		System.out.println("5.Exit");
		System.out.println("Enter your chioce:");

	}

}
