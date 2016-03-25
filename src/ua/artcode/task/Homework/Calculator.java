package ua.artcode.task.Homework;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 25.03.16
 * Time: 19:48
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Input first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Input Second number");
        int b = sc.nextInt();

        System.out.println("Input operation");
        Scanner as = new Scanner(System.in);
        String op = as.nextLine();

        int res = 0;
        if (op.equals("+")) {
            res = a + b;
        }
        if (op.equals("-")) {
            res = a - b;
        }
        if (op.equals("*")) {

            res = a * b;
        }
        if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
            }
            res = a / b;
        }
        System.out.println(res + "");
    }
}



