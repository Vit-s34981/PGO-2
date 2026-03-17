public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;
    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }
    public void printInfo() {
        System.out.println(title + " by " + author + ", " + pageCount + " pages | " + "availability: " + available);
    }
    public void borrow() {
        available = false;
    }
    public void returnBook() {
        available = true;
    }
}