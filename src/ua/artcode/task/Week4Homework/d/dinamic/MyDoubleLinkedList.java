package ua.artcode.task.Week4Homework.d.dinamic;

import ua.artcode.task.Week4Homework.d.common.Container;
import ua.artcode.task.Week4Homework.d.common.DoubleLinkedList;
import ua.artcode.task.Week4Homework.d.common.MyIterator;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class MyDoubleLinkedList implements Container {

    Node tail;
    Node head;

    public void addToTail(Object obj) {

        if (tail == null) {
            tail = new Node(obj, null);
        }
        tail = new Node(obj, null, tail.prev);
    }

    public void addToHead(Object obj) {

        if (head == null) {
            head = new Node(obj, null, null);
        }
        head = new Node(obj, head, null);
    }

    public Object popFromTail() {

        if (tail == null) {
            System.out.println("List is Empty");
        }
        Object object = tail.val;
        tail.prev = tail;
        return object;
    }

    public Object popFromHead() {

        if (head == null) {
            System.out.println();
        }
        Object object = head.val;
        head = head.next;
        return object;
    }

    public Object searchByValue(Object obj) {

        if (head == null) {
            System.out.println("List is empty");
        }
        while (!head.equals(obj)) {
            head = head.next;
        }
        return head;
    }

    @Override
    public MyIterator getIterator() {
        return new DoubleLinkedListIterator();
    }

    private class DoubleLinkedListIterator implements MyIterator {

        Node node;

        public DoubleLinkedListIterator(){

        }
        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                return node;
            } else return node.next;
        }
    }
}
