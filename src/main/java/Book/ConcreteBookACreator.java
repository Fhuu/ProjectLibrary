package Book;

public class ConcreteBookACreator extends ConcreteBookCreator {

    public ConcreteBook createBook() {
        return new ConcreteBookA();
    }
}
