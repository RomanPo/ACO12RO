package ua.artcode.task.Homework;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 21.03.16
 * Time: 22:15
 * To change this template use File | Settings | File Templates.
 * Написать класс массив.
 * - нахождение минимального
 * - нахождение максимального
 * - заполнение случайными числами в диапазоне
 * - красивый вывод на экран {2 4 5 6}
 * -* увеличить размер
 * -* сделать сортировку массива
 * -* метод для сравнения с другим массивом
 */

public class Array {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public void min() {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[0];
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public void max() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = array[0];
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

    public void insertion() {
        for (int i = 0; i < this.array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }
    }

    public void comparing(int[] array1) {
        System.out.println(this.array.length > array1.length);
    }

    public void beatifullOutput() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ " + array[i] + " }");
        }
    }

    public Array increasingLength(int increase) {
        Array array = new Array(new int[this.array.length + increase]);
        for (int i = 0; i < this.array.length; i++) {
            array.array[i] = this.array[i];
        }
        return array;
    }
}


