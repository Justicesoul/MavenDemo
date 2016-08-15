package practise_zAdvance;

import java.util.Hashtable;

public class Contact_Book {
	Hashtable<String, String> contacts;

	Contact_Book() {
		contacts = new Hashtable<String, String>();
	}


	/*
	 * Has the contact added to the phone book
	 * @param: String name
	 * @return: true if the contact was added, false otherwise
	 */
	public boolean hasName(String name) {
		return contacts.containsKey(name);
	}


	/* Find a contact by email address
	 * @param: String emailAddress
	 * @return: true if the contact with the email address was added, or false if not
	 */
	public boolean hasEmailAddress(String emailAddress) {
		return contacts.containsValue(emailAddress);
	}


	/*
	 * Find a contact
	 * @param: String name
	 * @return: the contact with the above name, or null if not found
	 */
	public String findEmailAddress(String name) {
		String emailAddress = contacts.get(name);
		if (emailAddress != null) {
			System.out.println("[" + name + "]: [" + emailAddress + "]");
			return emailAddress;
		}else {
			System.out.println("Contact for [" + name + "] not found");
			return null;
		}
	}


	/*
	 * Add a new contact
	 * @param: String name, String emailAddress
	 * @return: 1 if a new contact is created, 0 otherwise
	 */
	public int addContact(String name, String emailAddress) {
		if (hasEmailAddress(emailAddress)) {
			System.out.println("Cannot add [" + name + "]. Because the Email address [" + emailAddress+ "] existed");
			return 0;
		} else if (hasName(name)) {
			System.out.println("Name [" + name + "] existed");
			return 0;
		} else {
			contacts.put(name, emailAddress);
			System.out.println("A new contact for [" + name + "] added");
			return 1;
		}
	}


	/*
	 * Delete a contact
	 * @param: String name
	 * @return: 1 if one contact was deleted, 0 otherwise
	 */
	public int deleteContact(String name) {
		if (hasName(name)) {
			contacts.remove(name);
			System.out.println("Contact for [" + name + "] removed");
			return 1;
		} else {
			System.out.println("Contact for [" + name + "] not found");
			return 0;
		}
	}


	/*
	 * Print all contacts
	 */
	public void listAllContacts() {
		System.out.printf("* Current contact list\n");
		System.out.printf("%-10s|%-20s\n", "Name", "Email Address");
		for (String name : contacts.keySet()) {
			String emailAddress = contacts.get(name);
			System.out.printf("%-10s|%-20s\n", name, emailAddress);
		}
	}
}
