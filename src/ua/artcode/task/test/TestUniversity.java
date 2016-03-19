package ua.artcode.task.test;

import ua.artcode.task.model.Student;
import ua.artcode.task.model.University;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 19.03.16
 * Time: 19:47
 * To change this template use File | Settings | File Templates.
 */
public class TestUniversity {

    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Vasya","093202020", "Kiev", 20.0);
        Student student2 = new Student("Petya", "20202020", "Odessa", 56.0);
        University university = new University();

        System.out.println("Count of Sudents : " + university.getCounter());
        System.out.println("1. Add sudent");
        System.out.println("2. Delete Student");
        System.out.println("3. Do not remember");

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line.equals("1")){
            university.addStudent(student1);
        }
        System.out.println("Counter of students " + university.getCounter());
        System.out.println("Second choice");
        BufferedReader reader1 = new BufferedReader( new InputStreamReader(System.in));
        String line1 = reader1.readLine();
         if (line1.equals("2")){
             university.deleteStuddent(student1);
         }
        System.out.println("Counter is " + university.getCounter());
    }
}
