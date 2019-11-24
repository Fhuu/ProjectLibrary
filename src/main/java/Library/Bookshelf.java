package Library;

import Book.ConcreteBook;

import java.util.ArrayList;

class Bookshelf {

    private static Bookshelf bookshelf = new Bookshelf();
    private ArrayList<ConcreteBook> books;

    private Bookshelf() {
        books = new ArrayList<>();
    }

    public static Bookshelf getInstance() {
        return bookshelf;
    }

    public void addBookToBookshelf(ConcreteBook book) {
        this.books.add(book);
    }

    public ArrayList<ConcreteBook> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<ConcreteBook> books) {
        this.books = books;
    }
}
