package Book;

public class ConcreteBookBCreator extends ConcreteBookCreator {

    public ConcreteBook createBook() {
        return new ConcreteBookB();
    }
}
