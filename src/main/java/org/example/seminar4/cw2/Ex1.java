package org.example.seminar4.cw2;

import java.util.LinkedList;

/**
 * Заменить некратные 3 элементы списка, суммой нечетных элементов.
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> somelist = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            somelist.add(i);
            if (somelist.get(i) % 2 != 0) {
                sum += i;
            }
        }
        for (int i = 0; i < somelist.size(); i++) {
            if (somelist.get(i) % 3 != 0) {
                somelist.set(i,sum);
            }
        }
        System.out.println(somelist);
    }


}
