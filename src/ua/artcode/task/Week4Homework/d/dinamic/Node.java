package ua.artcode.task.Week4Homework.d.dinamic;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    public Object val;
    public Node next;

    public Node() {
    }

    public Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }
}
