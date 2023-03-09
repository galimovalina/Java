package org.example.seminar2.hw1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (isPrime(a)) {
                sum += a;
            }
        }
        System.out.println("Сумма простых чисел - " + sum);
    }

    /**
     * @param k число, которое необходимо проверить
     * @return является ли число простым
     */
    public static boolean isPrime(int k) {
        if (k < 2) {
            return false;
        }
        double s = sqrt(k);
        for (int i = 2; i <= s; i++) {
            if (k % i == 0)
                return false;
        }
        return true;
    }
}



