package ua.artcode.task.Week2.company.Homework.Library;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 22:31
 * To change this template use File | Settings | File Templates.
 */

public class Book {
    private String name;
    private String authorName;
    private int year;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    public Book(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
