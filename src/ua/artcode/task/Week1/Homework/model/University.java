package ua.artcode.task.Week1.Homework.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 19.03.16
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
public class University {

   private int counter = 0;
   private List<Student> listOfStudents = new ArrayList<Student>();

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
        counter++;
    }

    public void deleteStuddent(Student student) {
        if (listOfStudents.isEmpty()) {
            System.out.println("No students brother");

        } else {
            listOfStudents.remove(student);
            counter--;
        }
    }

}


