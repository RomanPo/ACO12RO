package ua.artcode.task.Week2.company.Homework;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 * Студент
 * поля:
 * Имя
 * Адрес
 * Предметы
 * методы:
 * учиться
 * добавить предмет
 * удалить предмет из списка последний
 * показать всю информацию о предметах
 * получить средний бал за все предметы
 */
public class Student {

    String name;
    Address address;
    Subject[] listOfSubjects = new Subject[10];
    int amountOfSubjects = 0;

    public Student(String name) {
        this.name = name;
    }

    public void addSubject(Subject subject) {
        amountOfSubjects++;
        for (int i = 0; i < amountOfSubjects; i++) {
            this.listOfSubjects[i] = subject;

        }
    }

    public void deleteSubject(Subject subject) {
        for (int i = 0; i < amountOfSubjects; i++) {
            listOfSubjects[amountOfSubjects - 1] = null;
            amountOfSubjects--;
        }
    }

    public void study(int hours, Subject subject) {
        subject.setAmountOfAccomplishedHours(subject.getAmountOfAccomplishedHours() + hours);
    }

    public void showInfoAboutSubject(Subject[] listOfSubjects) {
        for (int i = 0; i < listOfSubjects.length; i++) {
            listOfSubjects[i].toString();
        }

    }

    public int middleGrade(Subject[] listOfSubjects) {

        int a = 0;
        for (int i = 0; i < listOfSubjects.length; i++) {
            int result = 0;
            result += listOfSubjects[i].getGrade();
            a = result / listOfSubjects.length;
        }

        return a;
    }
}
