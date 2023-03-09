package org.example.seminar2.hw2;

import java.util.Scanner;

/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        if (isGrowing(n)) {
            System.out.println("Последовательность является возрастающей");
        } else{
            System.out.println("Последовательность не является возрастающей");
        }
    }

    /**
     *
     * @param n длина последовательности
     * @return является ли последовательность возрастающей
     */
    public static boolean isGrowing(int n) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (b < a) {
                return false;
            }
            a = b;
        }
        return true;
    }
}
