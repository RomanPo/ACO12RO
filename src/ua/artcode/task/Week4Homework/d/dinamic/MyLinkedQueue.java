package ua.artcode.task.Week4Homework.d.dinamic;

import ua.artcode.task.Week4Homework.d.common.Container;
import ua.artcode.task.Week4Homework.d.common.MyIterator;
import ua.artcode.task.Week4Homework.d.common.MyQueue;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
public class MyLinkedQueue implements MyQueue, Container {
    private Node tail;
    private Node top;

    @Override
    public MyIterator getIterator() {
        return new MyLinkedQueueIterator();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void enqueue(Object obj) {
        if (tail == null) {
            tail = new Node(obj, null);
        }
        Node myNode = new Node(obj, top);
        tail = myNode;

    }

    @Override
    public Object dequeue() {
        if (top == null) {
            return null;
        }
        Object neede = top;
        top = top.next;
        return neede;
    }

    private class MyLinkedQueueIterator implements MyIterator {
        private Node node;

        @Override
        public Object next() {
            if (!hasNext()) {
                return node;
            } else return node.next;
        }

        @Override
        public boolean hasNext() {
            return node.next != null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
