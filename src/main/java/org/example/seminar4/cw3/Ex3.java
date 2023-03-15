package org.example.seminar4.cw3;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
 */
public class Ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> somelist = new LinkedList<>(Arrays.asList(1,2,-3,-4,5,-6,7));
        for (int i = 0; i < somelist.size(); i++) {
            if (somelist.get(i) < 0) {
                somelist.remove(i);
                i--;
            }
        }
        System.out.println(somelist);
    }
}
