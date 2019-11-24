import Library.BookShelfController;

public class Main {
    public static void main(String[] args) {
        BookShelfController bsc = BookShelfController.getInstance();
        bsc.controlBook();
        bsc.printBookShelf();
    }
}
