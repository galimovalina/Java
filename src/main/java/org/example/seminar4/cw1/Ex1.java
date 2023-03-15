package org.example.seminar4.cw1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            ll.add(i);
            if (ll.get(i) % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(ll);
        System.out.println(sum);

        System.out.println("peek= " + ll.peek());
        System.out.println(ll);
        System.out.println("pop= " + ll.pop());
        System.out.println(ll);
        ll.addFirst(3);
        System.out.println("add First= " + ll);
        ll.addLast(7);
        System.out.println("add Last= " + ll);
        ll.remove(3);
        System.out.println("remove ind 3= " + ll);
        System.out.println(ll.contains(2));
    }
}
