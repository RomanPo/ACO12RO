package ua.artcode.task.Week4Homework.d.static1;

import ua.artcode.task.Week4Homework.d.common.Container;
import ua.artcode.task.Week4Homework.d.common.MyIterator;
import ua.artcode.task.Week4Homework.d.common.MyQueue;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
public class MyArrayQueue implements MyQueue, Container {
    private Object[] mas;
    private int tail;

    public MyArrayQueue(int tail) {
        this.tail = tail;
    }
    @Override
    public MyIterator getIterator() {
        return new MyArrayQueueIterator();  //To change body of implemented methods use File | Settings | File Templates.
    }
    @Override
    public void enqueue(Object obj) {
        if (tail == 0) {
            mas[tail] = obj;
            tail++;
        }

        Object[] newArray = Arrays.copyOf(mas, mas.length + 1);
        newArray[newArray.length - 1] = obj;
    }

    @Override
    public Object dequeue() {
        if (tail == 0) {
            return null;
        }
        Object o = mas[mas.length - 1];
        mas[mas.length - 1] = null;
        return o;
    }

    private class MyArrayQueueIterator implements MyIterator {
       private int index;

        @Override
        public Object next() {
            return mas[index+1];
        }

        @Override
        public boolean hasNext() {
            return next() == null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
