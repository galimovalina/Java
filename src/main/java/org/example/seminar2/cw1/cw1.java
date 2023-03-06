package org.example.seminar2.cw1;

import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(pow(x, n));
    }


    public static double pow(double x, int n) {
        double result = 1.0;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else {
            for (int i = 0; i < -n; i++) {
                result /= x;
            }
            }
            return result;
    }

}
