package ua.artcode.task.Week4Homework.d.dinamic;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
public class Node implements Comparable {
    Object val;
    Node next;
    Node prev;
    int nodeValue;

    public Node() {
    }

    public Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(Object val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getNodeValue()>;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }


    @Override
    public int compareTo(Object o) {
        return 1;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
