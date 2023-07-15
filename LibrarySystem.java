package lab6;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create instances of different book types
        FictionBook fictionBook = new FictionBook("murder 2 ", "devil", "Mystery");
        NonFictionBook nonFictionBook = new NonFictionBook("1984 sikh genocide", "saab", "History");
        ReferenceBook referenceBook = new ReferenceBook("Sapiens: A Brief History of Humankind", "yuval nora harari", "Science");
        Magazine magazine = new Magazine("little krishna", "kishan kumar", 123);

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

