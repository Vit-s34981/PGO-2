public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        
        library.addBook(new Book("The Art of War", "Sun Tzu", 100, true));
        library.addBook(new Book("The Art of Song", "Sun Su", 395, false));
        library.addBook(new Book("The Failure of Dance", "Moon Tzu", 25, true));

        Reader user = new Reader("John", "Smith", "123", 1);
        Reader user2 = new Reader("Ryan", "Johnson", "968", 0);
        Reader user3 = new Reader("Muhammad", "Ali", "576", 1);

        library.printAvailableBooks();
        
        library.borrowBook("The Art of War", user2);

        library.printAvailableBooks();

        library.returnBook("The Art of War", user2);

        user.printData();
        user2.printData();
        user3.printData();
    }
}