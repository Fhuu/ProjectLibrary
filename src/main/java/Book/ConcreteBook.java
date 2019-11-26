package Book;

public class ConcreteBook extends AConcreteBook {
    ConcreteBook(String title, String isbn, int pageNumber) {
        setTitle(title);
        setIsbn(isbn);
        setPageNumber(pageNumber);
    }
}
