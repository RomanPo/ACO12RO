package ua.artcode.task.Week4Homework.d.static1;

import ua.artcode.task.Week4Homework.d.common.Container;
import ua.artcode.task.Week4Homework.d.common.MyIterator;
import ua.artcode.task.Week4Homework.d.common.MyStack;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 20:11
 * To change this template use File | Settings | File Templates.
 */
public class MyArrayStack implements MyStack, Container {
    private Object[] mas;
    private int top;

    public MyArrayStack(int size) {
        mas = new Object[size];
    }

    @Override
    public MyIterator getIterator() {
        return new MyArrayStackIterator();
    }

    @Override
    public void push(Object obj) {
        if (top == mas.length) {
            System.out.println("Stack is full");
            return;
        }
        mas[top++] = obj;
    }

    @Override
    public Object pop() {
        Object forRet = mas[--top];
        mas[top] = null;
        return forRet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = top - 1; i > 0; i--) {
            sb.append(mas[i]).append("\n");
        }

        return "MyArrayStack{\n" +
                sb +
                '}';
    }

    private class MyArrayStackIterator implements MyIterator {

        private int index;

        @Override
        public Object next() {
            int nextIndex = ++index;
            index = nextIndex;
            return mas[nextIndex];

        }

        @Override
        public boolean hasNext() {
            return next() != null;
        }
    }
}
