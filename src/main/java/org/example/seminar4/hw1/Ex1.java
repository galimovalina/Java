package org.example.seminar4.hw1;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> somelist = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        LinkedList<Integer> resultlist = new LinkedList<>();
        for (int i = somelist.size() - 1; i >= 0; i--) {
            resultlist.add(somelist.get(i));

        }
        System.out.println(resultlist);
    }
}
