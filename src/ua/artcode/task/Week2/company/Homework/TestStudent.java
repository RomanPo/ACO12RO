package ua.artcode.task.Week2.company.Homework;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public class TestStudent {
    public static void main(String[] args) {
        Subject algebra = new Subject("Algebra", 126);
        Subject geometria = new Subject("Geometria", 140);
        Subject literature = new Subject("Literature", 160);
        Subject[] listOfSubject = {algebra, geometria, literature};

        Student student = new Student("Vasya");

        student.addSubject(algebra);
        student.addSubject(geometria);
        student.addSubject(literature);

        student.study(20, algebra);
        System.out.println(student.middleGrade(listOfSubject));
    }
}
