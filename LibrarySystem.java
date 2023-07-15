package lab6;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create instances of different book types
        Book book = new Book("Great Park", "stella");
        FictionBook fictionBook = new FictionBook("Murder by shadow", "shelin", "Mystery");
        NonFictionBook nonFictionBook = new NonFictionBook("Maharaja Ranjit Singh", "Saab", "History");
        ReferenceBook referenceBook = new ReferenceBook("How lava explodes", "steve", "Science");
        Magazine magazine = new Magazine("TMKOC", "Taarak Mehta", 123);

        // Call displayDetails() on each book to demonstrate polymorphism
        book.displayDetails();
        System.out.println("------------------------");
        fictionBook.displayDetails();
        System.out.println("------------------------");
        nonFictionBook.displayDetails();
        System.out.println("------------------------");
        referenceBook.displayDetails();
        System.out.println("------------------------");
        magazine.displayDetails();
    }
}
