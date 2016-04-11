package ua.artcode.task.Week4Homework.d.dinamic;

import ua.artcode.task.Week4Homework.d.common.Container;
import ua.artcode.task.Week4Homework.d.common.MyIterator;
import ua.artcode.task.Week4Homework.d.common.MyStack;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 20:07
 * To change this template use File | Settings | File Templates.
 */
public class MyLinkedStack implements MyStack, Container {
    private Node top;

    @Override
    public MyIterator getIterator() {
        return new MyLinkedStackIterator();
    }

    @Override
    public void push(Object obj) {
        if (top == null) {
            top = new Node(obj, null);
        } else {
            Node newNode = new Node(obj, top);
            top = newNode;
        }

        // above code could be replaced by top = new Node(obj,top)
    }

    @Override
    public Object pop() {

        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }

        Object forRet = top.val;
        top = top.next;
        return forRet;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{\n" +
                //"top=" + NodeUtils.toStringR(top).replaceAll("->", "\n") +
                '}';
    }

    private class MyLinkedStackIterator implements MyIterator {

      private  Node node;

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
