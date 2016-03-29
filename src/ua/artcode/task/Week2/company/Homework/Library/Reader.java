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
    String name;
    List<Book> listOfBooks = new ArrayList<Book>();
    int counter;
    boolean isInBlackList;

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
}
