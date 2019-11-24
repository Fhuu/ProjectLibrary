package Library;

import Book.*;

public class BookShelfController {
    private static BookShelfController bookShelfController = new BookShelfController();
    private Bookshelf bookshelf;

    private BookShelfController() {
        bookshelf = Bookshelf.getInstance();
    }

    public static BookShelfController getInstance() {
        return bookShelfController;
    }

    public void controlBook() {
        ConcreteBookCreator bookCreator = new ConcreteBookACreator();
        bookshelf.addBookToBookshelf(bookCreator.createBook());
        bookCreator = new ConcreteBookBCreator();
        bookshelf.addBookToBookshelf(bookCreator.createBook());
        bookCreator = new ConcreteBookCCreator();
        bookshelf.addBookToBookshelf(bookCreator.createBook());
    }

    public void printBookShelf() {
        for(ConcreteBook book : bookshelf.getBooks()) {
            System.out.println("Title: " + book.getTitle() +
                    "    ISBN: " + book.getIsbn() +
                    "    Page: " + book.getPageNumber());
        }
    }
}
