package org.example.seminar6.cw3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 3) Найти пересечения слов в массивах и указать их общее количество.
 */
public class Ex3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(List.of("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(List.of("qwe", "v"));
        Set<String> res = new HashSet<>(mas1);
        res.retainAll(mas2);
        List<String> all = new ArrayList<>(mas1);
        all.addAll(mas2);
        for (String item : res) {
            int count = 0;
            for (String allItem : all) {
                if (item.equals(allItem)) {
                    count++;
                }
            }
            System.out.println(item + " = " + count);


        }
    }
}
