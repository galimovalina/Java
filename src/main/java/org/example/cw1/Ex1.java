//Дано число n, найти разность проиведения и суммы его чисел

package org.example.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("result = " + substractProductandSum(n));

    }

    public static int substractProductandSum(int n) {
        int sum = 0, multi = 1;
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}
