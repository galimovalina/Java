package org.example.seminar2.hw3;

import java.util.Scanner;

/**
 * 3) Дан массив целых чисел.
 * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
        System.out.println();
        printArray(changeNegatives(arr));

    }

    /**
     * Метод выводит массив на экран
     *
     * @param array массив, который необходимо вывести
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    /**
     * Метод меняет отрицательные элементы на сумму индексов двузначных элементов массива.
     *
     * @param array изначальный массив
     * @return массив с суммой индексов двузначных элементов вместо отрицательных элементов
     */
    public static int[] changeNegatives(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((10 <= array[i] && array[i] <= 99) || (-99 <= array[i] && array[i] <= -10)) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sum;
        }
        return array;
    }
}
