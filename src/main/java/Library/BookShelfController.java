package Library;

import Book.AConcreteBook;
import Book.AConcreteBookCreator;
import Book.ConcreteBookCreator;

public class BookShelfController {
    private static BookShelfController bookShelfController = new BookShelfController();
    private Bookshelf bookshelf;
    private AConcreteBookCreator bookCreator;

    private BookShelfController() {
        bookshelf = Bookshelf.getInstance();
        bookCreator = new ConcreteBookCreator();

    }

    public static BookShelfController getInstance() {
        return bookShelfController;
    }

    public void init() {

        bookshelf.addBook(bookCreator.createBook("A", "001", 310));

        bookshelf.addBook(bookCreator.createBook("B", "012", 123));

        bookshelf.addBook(bookCreator.createBook("C", "058", 93));
    }

    public void addBook(String title, String isbn, int pageNumber) {
        bookshelf.addBook(bookCreator.createBook(title, isbn, pageNumber));
    }

    public void printBookShelf() {
        for(AConcreteBook book : bookshelf.getBooks()) {
            System.out.println("Title: " + book.getTitle() +
                    "    ISBN: " + book.getIsbn() +
                    "    Page: " + book.getPageNumber());
        }
    }
}
