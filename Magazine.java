package lab6;

public class Magazine extends Book {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }

    @Override
    public void displayBookType() {
        System.out.println("Book Type: Magazine");
    }
}
