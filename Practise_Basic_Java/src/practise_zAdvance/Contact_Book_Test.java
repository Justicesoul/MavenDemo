package practise_zAdvance;

public class Contact_Book_Test {

	public static void main(String[] args) {
		Contact_Book book = new Contact_Book();
		book.addContact("Alice", "alice@example.com");
		book.addContact("Bob", "bob@example.com");
		book.addContact("Cathrine", "cathrine@example.com");
		book.addContact("Jane", "cathrine@example.com");

		System.out.println("\n>>> Find contact");
		book.findEmailAddress("Alice");
		book.findEmailAddress("Jane");
		book.listAllContacts();

		System.out.println("\n>>> Remove contact");
		book.deleteContact("Alice");
		book.listAllContacts();
	}
}
