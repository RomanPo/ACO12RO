package ua.artcode.task.Week1.Homework.model;

/**
 * Created by serhii on 19.03.16.public int birthYear;
    public int birthMonth;
    public int birthDay;
 */
public class Student {


    private String name;
    private String phone;
    private String email = "romanpopov90@yahoo.com";
    Adress adress = new Adress();

    public Student(String name, String phone, String city, double paidMoney){
       this.name = name;
       this.phone = phone;
       adress.city = city;
       this.paidMoney = paidMoney;
   }
    private MyDate myDate = new MyDate(123,44,11); //

    private double paidMoney;

    private int taskCount;

    public String convertStudent(){

        // "name %s, phone %s, money %.2f, birthYear %d",
        return String.format("name %s, phone %s, money %.2f, birthYear %d",
                name, phone, paidMoney, myDate.birthYear);
    }

    public void init(String name, String phone, String city, double paidMoney) {

        Student me = this;


    }


}
