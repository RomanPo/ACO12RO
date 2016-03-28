package ua.artcode.task.Week2.company.Homework;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 28.03.16
 * Time: 20:59
 * To change this template use File | Settings | File Templates.
 */
public class Subject {

    String nameOfSubject;
    int amountOfHoursInSemester;
    int amountOfAccomplishedHours;
    int grade;

    public Subject(String nameOfSubject, int amountOfHoursInSemester) {
        this.nameOfSubject = nameOfSubject;
        this.amountOfHoursInSemester = amountOfHoursInSemester;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public int getAmountOfHoursInSemester() {
        return amountOfHoursInSemester;
    }

    public void setAmountOfHoursInSemester(int amountOfHoursInSemester) {
        this.amountOfHoursInSemester = amountOfHoursInSemester;
    }

    public int getAmountOfAccomplishedHours() {
        return amountOfAccomplishedHours;
    }

    public void setAmountOfAccomplishedHours(int amountOfAccomplishedHours) {
        this.amountOfAccomplishedHours = amountOfAccomplishedHours;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int passTheExam() {
        if (amountOfHoursInSemester - amountOfAccomplishedHours < 100) {
            System.out.println("Your grade is 3");
            return 3;
        }
        if (amountOfHoursInSemester - amountOfAccomplishedHours < 70) {
            System.out.println("Your grade is 4");
            return 4;
        }
        if (amountOfHoursInSemester - amountOfAccomplishedHours < 50) {
            System.out.println("Your grade is 5");
            return 5;
        } else System.out.println("You failed");
        return 2;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameOfSubject='" + nameOfSubject + '\'' +
                ", amountOfHoursInSemester=" + amountOfHoursInSemester +
                ", amountOfAccomplishedHours=" + amountOfAccomplishedHours +
                ", grade=" + grade +
                '}';
    }
}

