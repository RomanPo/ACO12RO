package ua.artcode.task.Week2.company.Homework.Library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 22:31
 * To change this template use File | Settings | File Templates.
 */
public class Reader {
    private String name;
    private List<Book> listOfBooks = new ArrayList<Book>();
    private int counter;

    public Reader(String name, List<Book> listOfBooks, int counter, boolean inBlackList) {
        this.name = name;
        this.listOfBooks = listOfBooks;
        this.counter = counter;
        isInBlackList = inBlackList;
    }

    private boolean isInBlackList;

    public boolean isInBlackList() {
        return isInBlackList;
    }

    public void setInBlackList(boolean inBlackList) {
        isInBlackList = inBlackList;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
        public void getAllReadersBooks(){
            for(Book book : this.getListOfBooks()){
                book.toString();
            }
        }
    public void borrowTheBook(String name, Library library) {
        if (this.getCounter() < 3) {
            for (int i = 0; i < library.getCountOfBooks() ; i++) {
                if (library.getListOfBooks()[i].getName().equals(name)) {
                    this.getListOfBooks().add(library.getListOfBooks()[i]);
                }
            }
        } else {
            System.out.println("Your limit is reached");
        }

    }
}
