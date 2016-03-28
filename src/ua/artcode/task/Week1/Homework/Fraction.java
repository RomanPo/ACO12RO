package ua.artcode.task.Week1.Homework;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 21.03.16
 * Time: 20:10
 * To change this template use File | Settings | File Templates.
 * Написать класс дробь
 * - сложение дробей
 * - вычитание
 * - умножение
 * - деление
 * - приведение к строке
 * - вывод
 * - метод для сравнения с другой дробью
 */

public class Fraction {
    private int chis;
    private int znam;

    public Fraction(int chis, int znam) {
        this.chis = chis;
        this.znam = znam;
    }

    private Fraction checkTheValueandDivide(Fraction fraction) {
        if (fraction.chis % 2 == 0 && fraction.znam % 2 == 0) {
            fraction.chis = fraction.chis / 2;
            fraction.znam = fraction.znam / 2;
        }
        return new Fraction(fraction.chis, fraction.znam);
    }

    public Fraction adding(Fraction fraction1) {
        if (this.znam == fraction1.znam) {
            return new Fraction(this.chis + fraction1.chis, this.znam);
        }
        checkTheValueandDivide(this);
        checkTheValueandDivide(fraction1);
        Fraction fraction = new Fraction((this.chis * fraction1.znam) + (fraction1.chis * this.znam), (this.znam * fraction1.znam));
        System.out.println("" + fraction.chis + " " + fraction.znam);
        return fraction;
    }

    public Fraction multip(Fraction fraction) {
        checkTheValueandDivide(this);
        checkTheValueandDivide(fraction);
        return new Fraction(this.chis * fraction.chis, this.znam * fraction.znam);
    }

    public String myString(Fraction fraction) {
        String resFraction;
        return resFraction = "" + fraction.chis + " " + fraction.znam;

    }

    public void compare(Fraction fraction) {
        if (fraction.chis > this.chis) {
            System.out.println(fraction.chis);
        } else {
            System.out.println(this.chis);
        }
        if (fraction.znam > this.znam) {
            System.out.println(fraction.znam);
        } else {
            System.out.println(this.znam);
        }
    }

}
