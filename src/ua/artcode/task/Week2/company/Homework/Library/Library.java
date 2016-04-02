package ua.artcode.task.Week2.company.Homework.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 22:28
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    private Reader[] listOfReaders;
    private Book[] listOfBooks;
    private int countOfBooks;
    private int countOfReaders;

    public Library(Reader[] listOfReaders, Book[] listOfBooks, int countOfBooks, int countOfReaders) {
        this.listOfReaders = listOfReaders;
        this.listOfBooks = listOfBooks;
        this.countOfBooks = countOfBooks;
        this.countOfReaders = countOfReaders;
    }

    public int getCountOfReaders() {
        return countOfReaders;
    }

    public void setCountOfReaders(int countOfReaders) {
        this.countOfReaders = countOfReaders;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }

    public Reader[] getListOfReaders() {
        return listOfReaders;
    }

    public void setListOfReaders(Reader[] listOfReaders) {
        this.listOfReaders = listOfReaders;
    }

    public Book[] getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(Book[] listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBookToLibrary(Book book) {
        Book[] newArray = Arrays.copyOf(getListOfBooks(), getCountOfBooks() + 1);
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = getListOfBooks()[i];
            newArray[newArray.length - 1] = book;
            newArray[i].toString();
        }
        this.setListOfBooks(newArray);
    }

    public void addReaderToList(Reader reader) {
        Reader[] newReader = Arrays.copyOf(getListOfReaders(), getCountOfReaders() + 1);
        for (int i = 0; i < newReader.length-1; i++) {
            newReader[i] = getListOfReaders()[i];
            newReader[newReader.length-1] = reader;
        }
        this.setListOfReaders(newReader);
    }

    public void checkBlackList(Reader reader) {
        if (reader.isInBlackList()) {
            System.out.println("You can not add a book");
        }
    }

    public List<Book> getbookOfSpecificAuthor(String authorName) {
        ArrayList<Book> listOfAuthorsBooks = new ArrayList<Book>();
        for (int i = 0; i < countOfBooks; i++) {
            if (getListOfBooks()[i].getAuthorName().equals(authorName)) {
                listOfAuthorsBooks.add(getListOfBooks()[i]);
            }
        }
        return listOfAuthorsBooks;
    }

    public List<Book> getBooksAfterSpecificYear(int year) {
        ArrayList<Book> listOfBooksSpecificYear = new ArrayList<Book>();
        for (int i = 0; i < countOfBooks; i++) {
            if (getListOfBooks()[i].getYear() > year) {
                listOfBooksSpecificYear.add(getListOfBooks()[i]);
            }
        }
        return listOfBooksSpecificYear;
    }
}
