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
    }
}