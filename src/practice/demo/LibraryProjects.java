package practice.demo;

class Library {
	String[] Book;
	int no_of_book;

	public Library() {
		this.Book = new String[100];
		no_of_book = 0;
	}

	void addBook(String book) {
		Book[no_of_book] = book;
		no_of_book++;
		System.out.println("Book has beed added Successfully!!");
	}

	void showBook() {
		for (String bk : Book) {
			if (bk == null) {
				continue;
			}
			System.out.println("* " + bk);

		}
	}

	void issueBook(String book) {
		for (int i = 0; i < Book.length; i++) {
			if (Book[i].equalsIgnoreCase(book)) {
				System.out.println(book + "Book has been issued");
				Book[i] = null;
				break;
			} else {
				System.out.println("No book found of given name");
				break;
			}
		}
		return;
	}

	void returnBook(String book) {
		addBook(book);
	}
}

public class LibraryProjects {

	public static void main(String[] args) {
		Library library = new Library();
		library.addBook("Story of Common Man");
		library.addBook("Java Programming");
		library.addBook("Pyhton Programming");
		library.showBook();
		library.issueBook("Java Programming");
		library.showBook();
		library.returnBook("Java Programming");
		library.showBook();
		library.issueBook("Java");

	}

}
