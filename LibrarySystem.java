package lab6;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create instances of different book types
        FictionBook fictionBook = new FictionBook("Fiction Book", "Fiction Author", "Mystery");
        NonFictionBook nonFictionBook = new NonFictionBook("Non-Fiction Book", "Non-Fiction Author", "History");
        ReferenceBook referenceBook = new ReferenceBook("Reference Book", "Reference Author", "Science");
        Magazine magazine = new Magazine("Magazine Title", "Magazine Author", 123);

        // Call displayDetails() and displayBookType() on each book to demonstrate polymorphism
        displayBookDetails(fictionBook);
        System.out.println("------------------------");
        displayBookDetails(nonFictionBook);
        System.out.println("------------------------");
        displayBookDetails(referenceBook);
        System.out.println("------------------------");
        displayBookDetails(magazine);
    }

    public static void displayBookDetails(Book book) {
        book.displayDetails();
        book.displayBookType();
    }
}

