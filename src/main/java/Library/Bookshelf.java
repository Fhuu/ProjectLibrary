package Library;

import Book.AConcreteBook;

import java.util.ArrayList;

class Bookshelf {

    private static Bookshelf bookshelf = new Bookshelf();
    private ArrayList<AConcreteBook> books;

    private Bookshelf() {
        books = new ArrayList<>();
    }

    public static Bookshelf getInstance() {
        return bookshelf;
    }

    public void addBook(AConcreteBook book) {
        this.books.add(book);
    }

    public ArrayList<AConcreteBook> getBooks() {
        return books;
    }

}
