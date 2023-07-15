package lab6;

public class ReferenceBook extends Book {
    private String topic;

    public ReferenceBook(String title, String author, String topic) {
        super(title, author);
        this.topic = topic;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Topic: " + topic);
    }
}

