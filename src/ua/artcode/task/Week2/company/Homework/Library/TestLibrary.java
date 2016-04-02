package ua.artcode.task.Week2.company.Homework.Library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 02.04.16
 * Time: 11:24
 * To change this template use File | Settings | File Templates.
 */
public class TestLibrary {
    public static void main(String[] args) {
        Book book = new Book("War and Piece", "Tolstoy");
        Book book1 = new Book("Zaratustra", "Nitzshe");
        Book book2 = new Book("Master", "Robert Green");
        Book[] booksAraay = {book, book1};
        List<Book> vasyasBooks = new ArrayList<Book>();
        vasyasBooks.add(book);
        Reader reader = new Reader("Vasya",vasyasBooks,vasyasBooks.size(),false);
        Reader reader1 = new Reader("Petya", vasyasBooks, vasyasBooks.size(), false);
        Reader reader2 = new Reader("Anton", vasyasBooks, vasyasBooks.size(),false);
        Reader[] readersArray = {reader, reader1};
        Library library = new Library(readersArray,booksAraay, booksAraay.length, readersArray.length);

        library.addBookToLibrary(book2);
        library.addReaderToList(reader2);
    }

}
