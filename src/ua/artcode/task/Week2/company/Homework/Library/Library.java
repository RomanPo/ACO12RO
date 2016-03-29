package ua.artcode.task.Week2.company.Homework.Library;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 22:28
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    Reader[] listOfReaders;
    Book[] listOfBooks;
    int countOfBooks;
    int countOfReaders;

    public int getCountOfBooks() {
        return countOfBooks;
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
        countOfBooks++;
        for (int i = 0; i < countOfBooks; i++) {
            listOfBooks[i] = book;
        }
    }

    public void addReaderToList(Reader reader) {
        countOfReaders++;
        for (int i = 0; i < countOfReaders; i++) {
            listOfReaders[i] = reader;
        }
    }

    public void borrowTheBook(String name, Reader reader) {
        if (reader.getCounter() < 3) {
            for (int i = 0; i < countOfBooks; i++) {
                if (listOfBooks[i].getName().equals(name)) {
                    reader.getListOfBooks().add(listOfBooks[i]);
                }
            }
        } else {
            System.out.println("Your limit is reached");
        }

    }

    public void checkBlackList(Reader reader) {
        if (reader.isInBlackList) {
            System.out.println("You can not add a book");
        }
    }
}
