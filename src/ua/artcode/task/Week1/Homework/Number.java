package ua.artcode.task.Week1.Homework;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 21.03.16
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 * Написать класс число.
 * - сложение
 * - вычитание
 * - умножение
 * - деление
 * - возведение в степень
 * - вычисление факториала
 * - вычисление остатка от деления
 * - метод который сравнивает два числа
 */
public class Number {
    int value;

    public Number(int value) {
        this.value = value;
    }

    public int adding(Number number1) {
        return this.value + number1.value;
    }

    public int minus(Number number1) {
        return this.value - number1.value;
    }

    public int multiplication(Number number1) {
        if (number1.value == 0 || this.value == 0) {
            System.out.println("Cannot multiply 0");
        }
        return this.value * number1.value;
    }

    public int stepen(int stepen) {
        int res = 1;
        if (stepen == 0) {
            return this.value;
        }
        for (int i = 0; i < stepen; i++) {
            res *= this.value;
        }
        return res;
    }

    public int factorial() {
        int res = 1;

        for (int i = 1; i < this.value; i++) {
            res *= i;
        }
        return res;
    }

    public int ostatok(Number number1) {
        return this.value % number1.value;
    }

    public void compare(Number number1) {
        if (this.value > number1.value) {
            System.out.println(this.value);
        }
        if (this.value == number1.value) {
            System.out.println("BOOOOOOOOO");
        } else System.out.println(number1.value);
    }
}
