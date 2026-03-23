public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void printAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].getTitle());
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int currentAvailable = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                currentAvailable++;
            }
        }
        return currentAvailable;
    }

    public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book != null && book.isAvailable()) {
            book.borrow();
            reader.increaseBorrowedCount();
            System.out.println(title + " borrowed by " + reader.getFirstName());
        } else if (book != null) {
            System.out.println(title + " is already borrowed");
        }
    }

    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book != null && !book.isAvailable()) {
            book.returnBook();
            reader.decreaseBorrowedCount();
            System.out.println(title + " returned.");
        }
    }
}