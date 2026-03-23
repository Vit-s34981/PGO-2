public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Art of War", "Sun Tzu", 100, true);
        Book book2 = new Book("The Art of Song", "Sun Su", 395, false);
        Book book3 = new Book("The Failure of Dance", "Moon Tzu", 25, true);
        
        book2.returnBook();
        book3.borrow();

        book.printInfo();
        book2.printInfo();
        book3.printInfo();


        Reader user = new Reader("John", "Smith", "123", 1);
        Reader user2 = new Reader("Ryan", "Johnson", "968", 0);
        Reader user3 = new Reader("Muhammad", "Ali", "576", 1);

        user2.increaseBorrowedCount();
        user3.decreaseBorrowedCount();

        user.printData();
        user2.printData();
        user3.printData();
    }
}