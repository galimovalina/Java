package org.example.seminar5.cw2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2)	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 1};
        System.out.println(searchDouble(arr));
        System.out.println(searchDouble2(arr));
    }

    private static boolean searchDouble(int[] arr) {
        Map<Integer, Integer> test = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (test.containsKey(arr[i])) {
                return true;
            } else {
                test.put(arr[i], 1);

            }
        }
        return false;
    }

    public static boolean searchDouble2(int[] arr) {
        Map<Integer, Integer> test = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            test.put(arr[i], 1);
        }
        return (test.size() != arr.length);
    }
}
