import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//base class
class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String checkOut() {
        if (isAvailable) {
            isAvailable = false;
            return title + " has been checked out.";
        } else {
            return title + " not available for checkout.";
        }
    }

    public String checkIn() {
        if (!isAvailable) {
            isAvailable = true;
            return title + " has beed checked in.";
        } else {
            return title + " is already in the library.";
        }
    }

    public String displayInfo() {
        return (
            "Title : " +
            title +
            " | Author : " +
            author +
            " | ISBN : " +
            isbn +
            " |"
        );
    }
}

// printed books
class PrintedBook extends Book {

    private int pageCount;
    private String condition;

    public PrintedBook(
        String title,
        String author,
        String isbn,
        int pageCount,
        String condition
    ) {
        super(title, author, isbn);
        this.pageCount = pageCount;
        this.condition = condition;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String displayInfo() {
        return (
            super.displayInfo() +
            " Page Count : " +
            pageCount +
            " | Condition " +
            condition
        );
    }

    public String repairBook() {
        if (!condition.equals("new")) {
            condition = "good";
            return (
                getTitle() + " has been repaired and now in good condition. "
            );
        }
        return getTitle() + " is already in good condition";
    }
}

// digital books
class EBook extends Book {

    private double fileSize;
    private String format;

    public EBook(
        String title,
        String author,
        String isbn,
        double fileSize,
        String format
    ) {
        super(title, author, isbn);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSie() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String displayInfo() {
        return (
            super.displayInfo() +
            " File Size : " +
            fileSize +
            " | Format : " +
            format
        );
    }

    public String download() {
        return (
            "Downloading " +
            getTitle() +
            "." +
            format +
            " ( " +
            fileSize +
            "MB) .... "
        );
    }
}

//Audio books
class AudioBook extends Book {

    private int duration;
    private String narrator;

    public AudioBook(
        String title,
        String author,
        String isbn,
        int duration,
        String narrator
    ) {
        super(title, author, isbn);
        this.duration = duration;
        this.narrator = narrator;
    }

    public int getDuration() {
        return duration;
    }

    public String getNarrator() {
        return narrator;
    }

    @Override
    public String displayInfo() {
        return (
            super.displayInfo() +
            " Duration : " +
            duration +
            " | Narrator : " +
            narrator
        );
    }

    public String playSample() {
        return (
            "Playing a sample of " +
            getTitle() +
            " narrated by " +
            narrator +
            "..."
        );
    }
}

class Library {

    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String addBook(Book book) {
        books.add(book);
        return book.getTitle() + " has been added to " + name + ".";
    }

    public String removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                Book removed = books.remove(i);
                return (
                    removed.getTitle() + " has been removed from " + name + "."
                );
            }
        }
        return "No Book with ISBN " + isbn + " found in " + name + ".";
    }

    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    public String displayAllBooks() {
        if (books.isEmpty()) {
            return name + " has no books in the collection";
        }

        StringBuilder result = new StringBuilder("Books in " + name + ":\n");
        for (Book book : books) {
            result.append("- ").append(book.displayInfo()).append("\n");
        }
        return result.toString();
    }
}

public class Seventh {

    public static void main(String[] args) {
        Library cityLibrary = new Library("City Public Library");

        PrintedBook printedBook1 = new PrintedBook(
            "To Kill a Mockingbird",
            "Harper Lee",
            "978-0446310789",
            336,
            "good"
        );
        PrintedBook printedBook2 = new PrintedBook(
            "1984",
            "George Orwell",
            "978-0451524935",
            328,
            "fair"
        );

        EBook ebook1 = new EBook(
            "The Great Gatsby",
            "F. Scott Fitzgerald",
            "978-0743273565",
            2.4,
            "EPUB"
        );
        EBook ebook2 = new EBook(
            "Python Programming",
            "John Smith",
            "978-1234567890",
            8.7,
            "PDF"
        );

        AudioBook audiobook1 = new AudioBook(
            "Harry Potter",
            "J.K. Rowling",
            "978-0747532743",
            510,
            "Stephen Fry"
        );

        System.out.println(cityLibrary.addBook(printedBook1));
        System.out.println(cityLibrary.addBook(printedBook2));
        System.out.println(cityLibrary.addBook(ebook1));
        System.out.println(cityLibrary.addBook(ebook2));
        System.out.println(cityLibrary.addBook(audiobook1));

        System.out.println(cityLibrary.displayAllBooks());

        System.out.println(printedBook1.checkOut());
        System.out.println(ebook1.checkOut());
        System.out.println(audiobook1.checkOut());

        System.out.println(printedBook2.repairBook());
        System.out.println(ebook2.download());
        System.out.println(audiobook1.playSample());
    }
}
