package org.example.seminar6.cw2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2) Найти пересечение двух множеств
 */
public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        Set<Integer> r = new HashSet<>(set1);
        r.retainAll(set2);
        System.out.println(r);
    }
}
