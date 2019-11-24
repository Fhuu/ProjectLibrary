package Book;

public class ConcreteBookCCreator extends ConcreteBookCreator {

    public ConcreteBook createBook() {
        return new ConcreteBookC();
    }
}
