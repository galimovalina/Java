//Дан массив целых чисел, верно ли что массив является симметричным?
package org.example.cw1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr = fillarray(arr);
        System.out.println(isArraySymmetrical(arr));

    }

    public static boolean isArraySymmetrical(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static int[] fillarray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

