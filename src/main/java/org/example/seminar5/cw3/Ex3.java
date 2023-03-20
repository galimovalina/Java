package org.example.seminar5.cw3;

import java.util.HashMap;
import java.util.Map;

/**
 * Написать перевод их Римских цифр в арабские
 */
public class Ex3 {
    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        String s = "LVIII";
        int res = myMap.get(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length() - 1; i++) {
            if (myMap.get(s.charAt(i)) < myMap.get(s.charAt(i + 1))) {
                res -= myMap.get(s.charAt(i));
            } else {
                res += myMap.get(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}
