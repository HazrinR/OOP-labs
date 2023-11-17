package week7;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
record  Book(String title, String author, int year, boolean status){

}
public class LibraryCatalog {
    private List<Book> books=new ArrayList<>();
    public void addBook(Book book){
        if(book!=null){
            books.add(book);
        }
    }
    //cekiramo dostupnost knjige po naslovu
    public Optional<Book> checkAvailabilityByTitle(String title){
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title)) //nije bitno jel napisemo taj naslov velikim ili malim slovima, prepoznat ce ga
                .findFirst();
    }
    //dohvatiti detalje za prvu available book by a specific author
    public Optional<Book> getFirstAvailableBookByAuthor(String author){
        return books.stream()
                .filter(book-> book.author().equalsIgnoreCase(author) && book.status()) //ovo pokrivamo trecom metodom gdje updejtujemo availability status of a book
                .findFirst();
    }
    public Optional<Book> updateAvailabilityStatus(String title, boolean status){
        books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .map(book -> new Book(book.title(), book.author(), book.year(), status));
       return null;
    }



    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        // Adding books to the catalog
        libraryCatalog.addBook(new Book("Java Programming", "John Smith", 2020, true));
        libraryCatalog.addBook(new Book("Python Basics", "Alice Johnson", 2018, false));
        libraryCatalog.addBook(new Book("Data Structures in C", "Bob Brown", 2019, true));
        libraryCatalog.addBook(new Book("Web Development", "Jane Doe", 2021, false));

        // Test availability check
        String bookToCheck = "Java Programming";
        Optional<Book> foundBook = libraryCatalog.checkAvailabilityByTitle(bookToCheck);
        foundBook.ifPresentOrElse(
                book -> System.out.println(book.title() + " is available."),
                () -> System.out.println(bookToCheck + " is not available in the catalog.")
        );

        // Test retrieving details of the first available book by a specific author
        String authorToCheck = "John Smith";
        Optional<Book> availableBookByAuthor = libraryCatalog.getFirstAvailableBookByAuthor(authorToCheck);
        availableBookByAuthor.ifPresentOrElse(
                book -> System.out.println("The first available book by " + authorToCheck + ": " + book),
                () -> System.out.println("No available books by " + authorToCheck + " found.")
        );

        // Test updating availability status
        String bookToUpdate = "Java Programming";
        boolean newAvailabilityStatus = false;
        Optional<Book> updatedBook = libraryCatalog.updateAvailabilityStatus(bookToUpdate, newAvailabilityStatus);

        updatedBook.ifPresentOrElse(
                book -> System.out.println("Updated availability status of " + book.title() + " to: " + book.status()),
                () -> System.out.println("Book with title " + bookToUpdate + " not found.")
        );

    }
}
