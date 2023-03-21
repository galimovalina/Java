package org.example.seminar5.hw1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().toLowerCase().replaceAll("[.—,]", "").replaceAll("  "," ").split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            myMap.putIfAbsent(str[i], 0);
            myMap.put(str[i], myMap.get(str[i]) + 1);
        }
        for (var entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " раз");
        }
    }
}
