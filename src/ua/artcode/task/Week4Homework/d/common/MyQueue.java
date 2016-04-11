package ua.artcode.task.Week4Homework.d.common;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 11.04.16
 * Time: 20:05
 * To change this template use File | Settings | File Templates.
 */
public interface MyQueue {
    // add to tail
    void enqueue(Object obj);

    // remove from head
    Object dequeue();

}
