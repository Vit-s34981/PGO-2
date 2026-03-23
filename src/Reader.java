public class Reader {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, String cardNumber, int borrowedCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }

    public void printData() {
        System.out.println(firstName + " " + lastName + ", card number: " + cardNumber + ", books borrowed: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
    }

    public void decreaseBorrowedCount() {
        if(borrowedCount > 0) {
            borrowedCount--;
        }
    }

    public String getFirstName() {
        return firstName;
    }
}