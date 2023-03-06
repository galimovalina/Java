package org.example.seminar2.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(sum5());

    }

    public static int sum5() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        int lastNum = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int currentNum = scanner.nextInt();
            if (currentNum % 10 == 5 && lastNum % 2 == 0) {
                sum+=currentNum;

            }
            lastNum=currentNum;
        }
        return sum;
    }
}
