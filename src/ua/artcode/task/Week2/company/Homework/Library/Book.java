package ua.artcode.task.Week2.company.Homework.Library;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 22:31
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    String name;
    String authorName;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
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

    public Book(String name) {

        this.name = name;
    }
}
