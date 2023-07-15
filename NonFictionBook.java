package lab6;
public class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}
