package Book;

public class ConcreteBookCreator extends AConcreteBookCreator {
    @Override
    public AConcreteBook createBook(String title, String isbn, int pageNumber) {
        return new ConcreteBook(title, isbn, pageNumber);
    }
}
